class Solution {	//	4 ms	41 MB
	public int singleNumber(int[] nums) {
		int len=nums.length;
		Arrays.sort(nums);
		int result=nums[len-1];
		int i=0;
		while(i<len-1){
			if(nums[i]!=nums[i+1]) {
				result=nums[i];
				break;
			}
			else i=i+2;
		}

		return result;
	}
}

class Solution {	//	1 ms	41 MB
	public int singleNumber(int[] nums) {
		int result=0;
		for(int i=0;i<nums.length;i++){
			result=result^nums[i];
		}
		return result;
	}
}