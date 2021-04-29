class Solution {	//	7 ms	40 MB
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
		StringBuffer result=new StringBuffer("");

		for(int i=0;i<s.length();i++){
		if(Character.isLetterOrDigit(s.charAt(i))) 
			result.append(s.charAt(i));
		}
		s=result.toString();
		StringBuffer reverse_result=result.reverse();
		boolean flag=s.equals(reverse_result.toString());
		return flag;

    }
}