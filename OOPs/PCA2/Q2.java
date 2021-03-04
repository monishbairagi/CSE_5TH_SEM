class Q2{
	public static void main(String args[]){  
		int a[] = new int[]{1, 2, 3};
		try {
			System.out.println("\n We are in Outer Try-Catch Block");
			System.out.println(a[3]); 
		}catch(ArrayIndexOutOfBoundsException e1){
			System.out.println(" ArrayIndexOutOfBoundsException: "+e1.getMessage());
			try {
				int x = a[1] / 0; 
			}catch(ArithmeticException e2){
				System.out.println("\n We are in Nested Try-Catch Block");
				System.out.println(" ArithmeticException: "+e2.getMessage()+"\n"); 
			}  
		} 
	} 
} 
