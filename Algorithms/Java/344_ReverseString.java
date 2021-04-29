class Solution {	//	1 ms	45.8 MB
	public void reverseString(char[] s) {
		int left=0;
		int right=s.length-1;
		while(left<right){
			char temp=s[right];
			s[right]=s[left];
			s[left]=temp;
			left++;
			right--;
		}
	}
}