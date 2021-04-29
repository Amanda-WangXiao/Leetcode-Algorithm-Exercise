class Solution {	//	1 ms	37.8 MB
	public boolean wordPattern(String pattern, String str) {
		String[] strArray=str.split(" ");
		var map_m=new HashMap<String,String>();
		int j=0;
		for(int i=0;i<strArray.length;i++){
			if(map_m.containsKey(strArray[i])==false){
				int a=1+j;
				map_m.put(strArray[i],String.valueOf(a));
				j++;
			}
		}
		StringBuffer s_m=new StringBuffer("");
		for(int k=0;k<strArray.length;k++){
			s_m.append(map_m.get(strArray[k]));
		}
		
		var map_p=new HashMap<Character,String>();
		int n=0;
		 for(int m=0;m<pattern.length();m++){
			if(map_p.containsKey(pattern.charAt(m))==false){
				int b=1+n;
				map_p.put(pattern.charAt(m),String.valueOf(b));
				n++;
			}
		}
		StringBuffer s_p=new StringBuffer("");
		for(int k=0;k<pattern.length();k++){
			s_p.append(map_p.get(pattern.charAt(k)));
		}
		return s_p.toString().equals(s_m.toString());
	}
}