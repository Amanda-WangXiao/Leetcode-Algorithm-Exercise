class Solution {	//	2 ms	38.2 MB
	public int lengthOfLastWord(String s) {
	   s=s.trim();
	   char[] a=s.toCharArray();
	   int len=a.length;
	   int mark=-1;
	   for(int i=0;i<len;i++){
		   if(a[i]==' ') mark=i>mark?i:mark;
	   }
	   return (len-mark-1);
	}
}