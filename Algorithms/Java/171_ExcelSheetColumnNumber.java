class Solution {	//	2 ms	38.3 MB
	public int titleToNumber(String s) {
		int result=0;
		int len=s.length();
		for(int i=0;i<len;i++) {
			char temp=s.charAt(i);
			result=(int)(temp-'@')*(int)Math.pow(26,len-i-1)+result;
		}
		return result;   
	}
}

class Solution {	//	1 ms	38.2 MB
	public int titleToNumber(String s) {
		int result=0;
		int len=s.length();
		for(int i=0;i<len;i++) {
			char temp=s.charAt(i);
			result=result*26+(int)(temp-'@');
		}
		return result;   
	}
}