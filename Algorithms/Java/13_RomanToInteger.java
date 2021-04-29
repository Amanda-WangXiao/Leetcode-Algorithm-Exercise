class Solution {
	public int romanToInt(String s) {  //7ms	40.2MB
		var m =new HashMap<Character,Integer>();
		m.put('I',1);
		m.put('V',5);
		m.put('X',10);
		m.put('L',50);
		m.put('C',100);
		m.put('D',500);
		m.put('M',1000);
		int len=s.length();
		int result=0;
		for(int i=0;i<len-1;i++){
			if(m.get(s.charAt(i))>=m.get(s.charAt(i+1))) result=result+m.get(s.charAt(i));
			else result=result-m.get(s.charAt(i));
		}
  
		result=result+m.get(s.charAt(len-1));
		return result;
	}
}

class Solution {
	public int romanToInt(String s) {	//4ms	40MB
		char[] c=s.toCharArray();
		int len=s.length();
		int result=0;

		for(int i=0;i<len-1;i++){
		if(getValue(c[i])>=getValue(c[i+1])) result=result+getValue(c[i]);
		else result=result-getValue(c[i]);
		}
  
		result=result+getValue(c[len-1]);
		return result;
	}

	public int getValue(char temp){
		switch(temp){
			case 'I':
			return 1;
			
			case 'V':
			return 5;

			case 'X':
			return 10;
			
			case 'L':
			return 50;
				
			case 'C':
			return 100;
			
			case 'D':
			return 500;
			
			case 'M':
			return 1000;

			default:
			return 0;
		}
	}
}
