class Solution {	//	183 ms		41.9 MB
	public int removeDuplicates(int[] nums) {
		int len=nums.length;
		if(len==0) return 0;
		if(len==1) return 1;

		for(int i=0;i<len-1;i++){
			for(int j=i+1;j<len;j++){
				if(nums[i]==nums[j]) nums[j]=123456;
			}
		}

		int count=0;
		for(int k=0;k<len;k++){
			if(nums[k]==123456) count++;
		}
		Arrays.sort(nums);
		return (len-count);
}
}


class Solution {	//	1 ms	41.5 MB
	public int removeDuplicates(int[] nums) {
		int len=nums.length;
		if(len==0) return 0;
		if(len==1) return 1;
		int j=0;
		for(int i=1;i<len;i++){
			if(nums[i]!=nums[j]){
				j++;
				nums[j]=nums[i];
			}
		}
		return j+1;
		
}
}