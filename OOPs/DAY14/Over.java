class AddClass{
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b){
		return a+b;
	}
	int add(int a,int b,int c){
		return a+b+c;
	}
}

class Over{
	public static void main(String[] args){
		AddClass ac = new AddClass();
		System.out.println("\n add(10,20) = "+ ac.add(10,20) +"\n");
		System.out.println(" add(10.5,20.3) = "+ ac.add(10.5,20.3) +"\n");
		System.out.println(" add(10,20,30) = "+ ac.add(10,20,30) +"\n");
	}
}