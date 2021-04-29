class Solution {	//	1 ms	38.5 MB
	public int strStr(String haystack, String needle) {
		int haystack_len = haystack.length();
		int needle_len = needle.length();

		if(needle_len==0) return 0;
		if(needle_len>haystack_len) return -1;

		for(int i=0;i+needle_len<=haystack_len;i++){
			if(haystack.substring(i,i+needle_len).equals(needle)) return i;
		}
		return -1;
	}
}

class Solution {	//	0 ms	38.3 MB
	public int strStr(String haystack, String needle) {
		int haystack_len = haystack.length();
		int needle_len = needle.length();

		if(needle_len==0) return 0;
		if(needle_len>haystack_len) return -1;

		for(int i=0;i+needle_len<=haystack_len;i++){
			if(haystack.charAt(i)==needle.charAt(0)){
				if(haystack.substring(i,i+needle_len).equals(needle)) return i;
			}
		}
		return -1;
	}
}

class Solution {	//	2 ms	36.8 MB
	public int strStr(String haystack, String needle) {
		int haystack_len = haystack.length();
		int needle_len = needle.length();

		if(needle_len==0) return 0;
		if(needle_len>haystack_len) return -1;

		for(int i=0;i+needle_len<=haystack_len;i++){
			int j=0;
			if(haystack.charAt(i)==needle.charAt(0)){
				while(j<needle_len){
					if(haystack.charAt(i+j)!=needle.charAt(j)) break;
					j++;
				}
				if(j>=needle_len) return i;
			}
		}

		return -1;
	}
}