class Solution {	//	326 ms	39.6 MB
	public int maxProfit(int[] prices) {
		int result=0;
		int temp=-1;
		for(int i=1;i<prices.length;i++){
			for(int j=0;j<i;j++){
				temp=prices[i]-prices[j];
				if(temp>0) result=temp>result?temp:result;
			}
		}
		return result;
	}
}

class Solution {	//	1 ms	39.9 MB
	public int maxProfit(int[] prices) {
		int result=0;
		int min=9999;
		int temp=0;
		for(int i=0;i<prices.length;i++){
			min=prices[i]<min?prices[i]:min;
			temp=prices[i]-min;
			result=result>temp?result:temp;
		}
		return result;
	}
}