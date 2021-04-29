class Solution {	//	2 ms	38.9 MB
	public String reverseVowels(String s) {
		int len=s.length();
		char[] s_to_char=s.toCharArray();
		int left=0;
		int right=len-1;
		while(left<right){
			if(judge(s_to_char[left])==true){
				while(judge(s_to_char[right])!=true){
					right--;
				}
				char temp=s_to_char[right];
				s_to_char[right]=s_to_char[left];
				s_to_char[left]=temp;
				right--;
			}
			left++;
		}
		return String.valueOf(s_to_char);
	}

	public boolean judge(char temp){
		if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u') return true;
		else if(temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U') return true;
		else return false;
	}
}