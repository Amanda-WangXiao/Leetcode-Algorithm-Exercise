class Solution {	//	1 ms	39.5 MB
	public int maxProfit(int[] prices) {
		int temp=prices[0];
		int result=0;
		int mark=0;
		for(int i=0;i<prices.length-1;i++){
			if(prices[i]>prices[i+1]){
				result=result+prices[i]-temp;
				temp=prices[i+1];
				mark=i+1;
			}
		}
		result=result+prices[prices.length-1]-prices[mark];
		return result;
	}
}

