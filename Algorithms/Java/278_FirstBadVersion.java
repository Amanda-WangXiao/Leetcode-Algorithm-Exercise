/* The isBadVersion API is defined in the parent class VersionControl.
	  boolean isBadVersion(int version); */
	
public class Solution extends VersionControl {	//	Time Limit Exceeded
	public int firstBadVersion(int n) {
		for(int i=0;i<=n;i++){
			if(isBadVersion(i)==true) return i; 
		}
		return 0;
	}
}

public class Solution extends VersionControl {	//	16 ms	36.3 MB
	public int firstBadVersion(int n) {
		int left=1;
		int right=n;
		int mid=0;
		while(left<right){
		   mid=left+(right-left)/2;
		   if(isBadVersion(mid)==false) left=mid+1;
		   else right=mid;
		}
		return left;
	}
}