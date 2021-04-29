class Solution {	//	1 ms	39.6 MB
	public int maxSubArray(int[] nums) {
		if(nums.length==1) return nums[0];
		int sum=0;
		int max=nums[0];
		for(int i=0;i<nums.length;i++){
			if(sum<0) {
				sum=nums[i];
				max=sum>max?sum:max;
				continue;
			}
			sum=sum+nums[i];
			max=sum>max?sum:max;
		}
		return max;
	}
}