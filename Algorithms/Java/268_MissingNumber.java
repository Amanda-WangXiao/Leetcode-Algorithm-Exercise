class Solution {	//	6 ms	40.3 MB
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int j=0;
		for(int i=0;i<nums.length;i++){
			if(j!=nums[i]) return j;
			j++;
		}
		return (nums[nums.length-1]+1);
	}
}

class Solution {	//	6 ms	40.1 MB
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int len=nums.length;
		int AddValue=len*(len+1)/2;
		int TempValue=0;
		for(int i=0;i<len;i++){
			TempValue=TempValue+nums[i];
		}
		return (AddValue-TempValue);
	}
}