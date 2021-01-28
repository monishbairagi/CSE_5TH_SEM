class factorial{
	public static void main(String a[]){
		int n = 5,f = 1;
		for(int i=1;i<=n;i++){
			f*=i;
		}
		System.out.println("Factorial of "+n+" is "+f+".");
	}
}