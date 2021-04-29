class Solution {
	 public boolean isPalindrome(int x) {
		
		if(x<0) return false;
		int size=0;
		int a=x;
		int p;
		int k=0;
		while(x!=0){
		   p=x%10; 
		   k=k*10+p;
		   x=x/10;
		}
		
		if(a==k) return true;
		else return false;
	    }
}