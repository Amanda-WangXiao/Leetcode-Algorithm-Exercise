class Solution {	//	0 ms	38 MB
	public int[] plusOne(int[] digits) {
		int len=digits.length;
		int temp=digits[len-1]+1;
		digits[len-1]=temp;
		for(int i=len;i>1;i--){
			if(digits[i-1]==10){
				digits[i-1]=0;
				digits[i-2]=digits[i-2]+1;
			}
		}

		if(digits[0]==10){
			int[] result=new int[len+1];
			for(int j=0;j<len-1;j++){
				result[j+2]=digits[j+1];
			}
			result[0]=1;
			result[1]=0;
			return result;
		}
		return digits;
	}
}