class Solution {	//	17 ms	39.6 MB
	public boolean isPowerOfThree(int n) {
		if(n<1) return false;
		if(n==1) return true;
		while(n>1){
			int temp=n;
			if(temp%3!=0) return false;
			n=n/3;
		}
		return true;
	}
}