class Solution {	//	0 ms	36.9 MB
	public String convertToTitle(int n) {
	 StringBuffer s=new StringBuffer("");
	 int q=0;
	 while(n>0){
		 n--;
		 s.append((char)(n%26+'A'));
		 n=n/26;
	 }
	 s=s.reverse();
	 return s.toString();
	}
}