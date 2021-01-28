class prime{
	public static void main(String a[]){
		int n = 7,p = 1;
		for(int i=2;i<n;i++){
			if(n%i==0){
				p = 0;
				break;
			}
		}
		if(p==1){
			System.out.println(n+" is Prime.");
		}else{
			System.out.println(n+" is Not Prime.");
		}
	}
}