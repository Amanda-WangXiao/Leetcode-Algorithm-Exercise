/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
class NumArray {	//	80 ms	42.7 MB
	int[] data;
	public NumArray(int[] nums) {
		data=nums;
	}
	
	public int sumRange(int i, int j) {
		int result=0;
		for(int k=i;k<=j;k++){
		result=result+data[k];
		}
		return result;
	}

}

class NumArray {	//	Memory Limit Exceeded
	int[][] data;
	public NumArray(int[] nums) {
		int len=nums.length;
		data=new int[len][len];
		for(int i=0;i<len;i++){
			int temp=nums[i];
			for(int j=i;j<len;j++){
                if(i==j){
                    data[i][j]=temp;
                    continue;
                }
				data[i][j]=temp+nums[j];
				temp=data[i][j];
			}
		}
	}
	
	public int sumRange(int i, int j) {
		return data[i][j];
	}

}
