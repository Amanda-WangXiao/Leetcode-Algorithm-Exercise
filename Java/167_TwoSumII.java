class Solution {	//	217 ms	40.3 MB
	public int[] twoSum(int[] numbers, int target) {
		for(int i=0;i<numbers.length-1;i++){
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
			}
		}
		return new int[] {0};
	}
}

class Solution {	//	1 ms	40 MB
	public int[] twoSum(int[] numbers, int target) {
		int i=0;
		int j=numbers.length-1;
		while(i<j){
			if(numbers[i]+numbers[j]==target) return new int[] {i+1,j+1};
			else if(numbers[i]+numbers[j]<target) i++;
			else j--;
		}
		return new int[] {0};
	}
}