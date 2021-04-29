class Solution {    //  0 ms    35.8 MB
    public int rob(int[] nums) {
        int len = nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];

        int rob_max[] = new int[len];
        rob_max[0]=nums[0];
        rob_max[1]=nums[0]>nums[1]?nums[0]:nums[1];

        for(int i=2;i<len;i++){
            rob_max[i] = Math.max((rob_max[i-2]+nums[i]),rob_max[i-1]);
        }

        return rob_max[len-1];
    }
}