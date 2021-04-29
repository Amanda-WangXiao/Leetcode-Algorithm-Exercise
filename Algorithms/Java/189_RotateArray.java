class Solution {	//	0 ms	40.5 MB
	public void rotate(int[] nums, int k) {
		int len=nums.length;
		int[] result=new int[len];
		for(int i=0;i<len;i++){
			result[(i+k)%len]=nums[i];
		}
		System.arraycopy(result,0,nums,0,len);
	}
}

class Solution {	//	254 ms	40.3 MB
	public void rotate(int[] nums, int k) {
		int len=nums.length;
		for(int i=0;i<k;i++){
			int final_num=nums[len-1];
			for(int j=len-1;j>0;j--) nums[j]=nums[j-1];
			nums[0]=final_num;
		}
	}
}

class Solution {	//	0 ms	40.6 MB
	public void rotate(int[] nums, int k) {
		int len=nums.length;
		k=k%len;
		iReverse(nums,0,len-1);
		iReverse(nums,0,k-1);
		iReverse(nums,k,len-1);
	}

	public void iReverse(int[] nums,int start,int end){
		while(start<end){
			int temp=nums[end];
			nums[end]=nums[start];
			nums[start]=temp;
			start++;
			end--;
		}
	}
}