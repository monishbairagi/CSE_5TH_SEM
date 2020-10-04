import java.util.*;

class CalClass{
	double a;
	double b;
	
	void putData(double i,double j){
		a = i;
		b = j;
	}
	
	double add(){
		return a + b;
	}
	
	double sub(){
		return a - b;
	}
	
	double div(){
		return a / b;
	}
	
	double mul(){
		return a * b;
	}
}

class Calculator{
	public static void main(String[] args){
		double n1, n2;
		CalClass cal = new CalClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number:");
		n1 = sc.nextDouble();
		System.out.print("Enter 2nd Number:");
		n2 = sc.nextDouble();
		sc.close();
		
		cal.putData(n1,n2);
		
		System.out.println("\nAddition: "+cal.add());
		System.out.println("Substraction: "+cal.sub());
		System.out.println("Multiplication: "+cal.mul());
		System.out.println("Division: "+cal.div());
	}
}