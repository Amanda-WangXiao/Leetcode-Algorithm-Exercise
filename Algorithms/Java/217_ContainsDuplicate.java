class Solution {	//	Time Limit Exceeded
	public boolean containsDuplicate(int[] nums) {
		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==nums[j]) return true;
			}
		}
		return false;
	}
}

class Solution {	//	4 ms	43.6 MB
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++){
			if(nums[i]==nums[i+1]) return true;
		}
		return false;
	}
}

class Solution {	//	8 ms	46.2 MB
	public boolean containsDuplicate(int[] nums) {
		var s=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++){
			if(s.contains(nums[i])==false) s.add(nums[i]);
			else return true;
		}
		return false;
	}
}