class Solution {	//	Time Limit Exceeded
	public int climbStairs(int n) {
		int result=0;
		if(n==1)    result=1;
		else if(n==2)    result=2;
		else result=climbStairs(n-2)+climbStairs(n-1);

		return result;
	}
}

class Solution {	//	0 ms	36.6 MB
	public int climbStairs(int n) {
		int result=0;
		int temp1=1;
		int temp2=2;
		if(n==1) return temp1;
		else if(n==2) return temp2;
		else{
			for(int i=3;i<=n;i++){
				result=temp1+temp2;
				temp1=temp2;
				temp2=result;
			}
		}
		return result;
	}
}