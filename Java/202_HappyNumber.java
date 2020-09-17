class Solution {	//	2 ms	36.3 MB
	public boolean isHappy(int n) {
		if(n==1) return true;
		var s=new HashSet<Integer>();
		while(n!=1){
			n=calculate(n);
			if(s.contains(n)) return false;
			s.add(n);
		}
		return true;
	}

	public int calculate(int n){
		int result=0;
		while(n!=0){
			int temp=n%10;
			result=result+temp*temp;
			n=n/10;
		}
		return result;
	}
}

class Solution {	//	1 ms	35.4 MB
	public boolean isHappy(int n) {
		if(n==1) return true;
		int slow=n;
		int fast=calculate(n);
		while(fast!=1&&fast!=slow){
			slow=calculate(slow);
			fast=calculate(calculate(fast));
		}
		return fast==1;
	}

	public int calculate(int n){
		int result=0;
		while(n!=0){
			int temp=n%10;
			result=result+temp*temp;
			n=n/10;
		}
		return result;
	}
}