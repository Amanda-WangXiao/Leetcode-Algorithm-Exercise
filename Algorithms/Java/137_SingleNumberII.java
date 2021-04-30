class Solution {    //  2 ms    38.4 MB
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int result = nums[0];
        int i = 0;
        while(i<nums.length-2){
            if(nums[i]==nums[i+2]) {
                i=i+3;
                result=nums[i];
            }
            else return result;
        }
        return result;
    }
}