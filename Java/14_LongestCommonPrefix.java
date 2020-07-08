class Solution {	//	1ms	39.5MB
	public String longestCommonPrefix(String[] strs) {
		int len=strs.length;
		if(len==0) return "";
		else if (len==1) return strs[0];
		else{
			String result=findPrefix(strs[0],strs[1]);
			 for(int i=2;i<len;i++){
				result=findPrefix(result,strs[i]);
			 }
			   return result;
		}
	}

	public String findPrefix(String t1, String t2){
		int minLen=t1.length()<t2.length()?t1.length():t2.length();
		StringBuilder tempResult=new StringBuilder();
		for(int i=0;i<minLen;i++){
			if (t1.charAt(i)==t2.charAt(i)) tempResult.append(t1.charAt(i));
			else break;
		}
		return tempResult.toString();
	}
}