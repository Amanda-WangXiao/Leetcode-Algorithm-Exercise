class Solution {	//	4 ms	39.1 MB
	public boolean isAnagram(String s, String t) {
		int len_s=s.length();
		int len_t=t.length();
		if(len_s!=len_t) return false;
		char[] s_char=s.toCharArray();
		char[] t_char=t.toCharArray();
		Arrays.sort(s_char);
		Arrays.sort(t_char);
		for(int i=0;i<len_s;i++){
			if(s_char[i]!=t_char[i]) return false;
		}
		return true;
	}
}