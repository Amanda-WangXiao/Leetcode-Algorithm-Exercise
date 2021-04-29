class Solution {	//	1 ms	38.4 MB
	public int removeElement(int[] nums, int val) {
		int len=nums.length;
		int count=0;
		for(int i=0;i<len;i++){
			if(nums[i]==val){
				nums[i]=123456;
				count++;
			}
		}
		Arrays.sort(nums);
		return (len-count);
	}
}

class Solution {	// 0 ms		38.3 MB
	public int removeElement(int[] nums, int val) {
		int len=nums.length;
		int j=0;
		for(int i=0;i<len;i++){
			if(nums[i]!=val){
				nums[j]=nums[i];
				j++;
			}
		}
		return j;
	}
}