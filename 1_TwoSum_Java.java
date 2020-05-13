class Solution {
    public int[] twoSum_1(int[] nums, int target) {   //Brute Solution
        int i,j;
        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target) return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("Error");
    }

    public int[] twoSum_2(int[] nums, int target) {  //Hash Table
        int i;
        Map<Integer,Integer> m=new HashMap<>();
        for(i=0;i<nums.length;i++) m.put(nums[i],i);

        for(i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(m.containsKey(complement) && m.get(complement)!=i)
                return new int[] {i,m.get(complement)};
        }

        throw new IllegalArgumentException("Error");
    }

    }

