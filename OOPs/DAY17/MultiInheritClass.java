import java.util.*;

class Addition{
	double a,b;
	
	void takeNumbers(double a,double b){
		this.a = a;
		this.b = b;
	}
	
	double getAddition(){
		return a + b;
	}
}

class AddAndSub extends Addition{
	double getSubtraction(){
		return a - b;
	}
}

class Calculator extends AddAndSub{
	double getMultiplication(){
		return a * b;
	}
	double getDivision(){
		return a / b;
	}
}

class MultiInheritClass{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		double a = in.nextInt();
		double b = in.nextInt();
		
		Calculator num = new Calculator();
		
		num.takeNumbers(a,b);
		System.out.println(a+" + "+b+" = "+num.getAddition());
		System.out.println(a+" - "+b+" = "+num.getSubtraction());
		System.out.println(a+" * "+b+" = "+num.getMultiplication());
		System.out.println(a+" / "+b+" = "+num.getDivision());
		System.out.println();
	}
}