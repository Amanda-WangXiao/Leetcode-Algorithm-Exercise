class Solution {	//	2 ms	37.1 MB
	public int addDigits(int num) {
		while(num>=10){
			num=addBit(num);
		}
		return num;
	}

	public int addBit(int num){
		int result=0;
		while(num>0){
			result=result+num%10;
			num=num/10;
		}
		return result;
	}
}

class Solution {	//	1 ms	37.1 MB
	public int addDigits(int num) {
	return (num-1)%9+1;
	}
}