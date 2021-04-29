int reverse(int x){ 
	int i;
	int size=0;
	int a=x;
	if(x>=2147483648||x<=-2147483648) return 0; 
	while(a!=0){
		size++;
		a=a/10;
	}
   
	long int p=0;
	
	for(i=0;i<size;i++){
		int b=x%10;
		x=x/10;
		p=b+p*10;
		if(p>=2147483648||p<=-2147483648) return 0; 
	}
	
	return p;
}