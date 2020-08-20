class Solution {	//	1 ms	37 MB
	public boolean isPowerOfTwo(int n) {
		if(n==0) return false;
		int b=(int)(Math.log(n)/Math.log(2));
		if(Math.pow(2,b)!=n) return false;
		return true;
	}
}

class Solution {	//	1 ms	36.7 MB
	public boolean isPowerOfTwo(int n) {
		if(n<=0) return false;
		while(n>1){
			if(n%2==0) n=n/2;
			else return false;
		}
		return true;
	}
}