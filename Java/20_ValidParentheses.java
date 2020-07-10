class Solution {	//	3ms		37.5MB
	public boolean isValid(String s) {
		int len=s.length();
		if(len%2!=0) return false;
		if(len==0) return true;
		var st= new Stack<Character>();
		st.push('!');
		st.push(s.charAt(0));
		for(int i=1;i<len;i++){
			if((st.peek()=='(') && (s.charAt(i)==')') ) st.pop();
			else if( (st.peek()=='{') && (s.charAt(i)=='}') )  st.pop();
			else if( (st.peek()=='[') && (s.charAt(i)==']') ) st.pop();
			else  st.push(s.charAt(i));
		}
		st.pop();
		if(st.empty()==true) return true;
		else return false; 
	}
}