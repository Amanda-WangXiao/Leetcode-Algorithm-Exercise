class Solution {	//	2 ms	43.2 MB
	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		int result=nums[nums.length/2];
		return result;
	}
}

class Solution {	//	18 ms	45 MB
	public int majorityElement(int[] nums) {
		var m=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			if(m.containsKey(nums[i])==false) m.put(nums[i],1);
			else m.put(nums[i],m.get(nums[i])+1);
		}
		var values=new ArrayList<Integer>(m.values());
		
		int result_value=0;
		int result=0;
		Iterator i=m.keySet().iterator();
		while(i.hasNext()){
			Object key = i.next();
			Object value = m.get(key);
			if((int)value>result_value){
				result_value=(int)value;
				result=(int)key;
			}
		}

		return result;
	}
}