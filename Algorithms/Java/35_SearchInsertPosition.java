class Solution {	//	0 ms 	39.4 MB
	public int searchInsert(int[] nums, int target) {
		int len=nums.length;
		if(nums[0]==target) return 0;
		for(int i=0;i<len;i++){
			if(nums[i]>=target) return i;
		}
		return len;
	}
}