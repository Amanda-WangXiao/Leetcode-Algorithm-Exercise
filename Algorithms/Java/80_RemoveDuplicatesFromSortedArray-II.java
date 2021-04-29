class Solution {	//	0 ms	38.6 MB
	public int removeDuplicates(int[] nums) {
		int len = nums.length;
		if(len<=2) return len;
		int fast = 2;
		int slow = 2;

		while(fast<len){
			if(nums[fast]!=nums[slow-2]){
				nums[slow] = nums[fast];
				slow++;
			}
			fast++;
		}
		return slow;
	}
}