class Solution {	//	11 ms	39 MB
	public boolean isIsomorphic(String s, String t) {
		var m=new HashMap<Character,Character>();
		int len=s.length();
		if(len==0) return true;
		m.put(s.charAt(0),t.charAt(0));
		for(int i=1;i<len;i++){
			if(m.containsKey(s.charAt(i))==false){
				if(m.containsValue(t.charAt(i))==false){
					m.put(s.charAt(i),t.charAt(i));
				}
				else return false;
			}
			else {
				if(m.get(s.charAt(i))!=t.charAt(i)) return false;
			}
		}
		return true;
	}
}