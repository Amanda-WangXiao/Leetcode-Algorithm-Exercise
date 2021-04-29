class Solution {	//	Only for short String
	public String addBinary(String a, String b) {
	 int Oct_a=Integer.parseInt(a,2);
	 int Oct_b=Integer.parseInt(b,2);
	 String result=Integer.toBinaryString(Oct_a+Oct_b);
	 return result;
	}
}

class Solution {	//	3 ms	39.8 MB
	 public String addBinary(String a, String b) {
	  int len_a=a.length();
	  int len_b=b.length();
	  int len=Math.max(len_a,len_b);

	  if(len_a>len_b){
			StringBuffer s_b=new StringBuffer(b);
			String temp_b=b;
			int temp_len=len_a-len_b;
			for(int j=0;j<temp_len;j++){
				 s_b.append("0");
			}
			s_b.reverse();
			b=s_b.toString();
			b=b.substring(0,temp_len)+temp_b;
	  }
	  
	  if(len_a<len_b){
			StringBuffer s_a=new StringBuffer(a);
			String temp_a=a;
			int temp_len=len_b-len_a;
			for(int j=0;j<temp_len;j++){
				 s_a.append("0");
			}
			s_a.reverse();
			a=s_a.toString();
			a=a.substring(0,temp_len)+temp_a;
	  }

	  char[] char_a=a.toCharArray();
	  char[] char_b=b.toCharArray();

	  int temp=0;

	  StringBuffer s=new StringBuffer();

	  for(int i=len-1;i>=0;i--){
			int tempresult=((char_a[i]-'0')+(char_b[i]-'0')+temp)%2;
			temp=((char_a[i]-'0')+(char_b[i]-'0')+temp)/2;
			s.append(String.valueOf(tempresult));
	  }
	  s.reverse();
	  
	if(temp==1){
			s.reverse();
			s.append("1");
			s.reverse();
	  }
	  
	  return s.toString();
	 }
}