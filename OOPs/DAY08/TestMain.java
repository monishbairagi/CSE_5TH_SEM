import java.util.*;

class Calculator{
	double a;
	double b;
	Calculator(double num1,double num2){
		a=num1;
		b=num2;
	}
	double add(){
		return a+b;
	}
	double sub(){
		return a-b;
	}
	double mul(){
		return a*b;
	}
	double div(){
		return a/b;
	}
}

class TestMain{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("Enter Number-1: ");
			double a = input.nextDouble();
			System.out.print("Enter Number-2: ");
			double b = input.nextDouble();
			System.out.println();
		
			Calculator cal = new Calculator(a,b);

			System.out.println("'+' To Addition");
			System.out.println("'-' To Substuction");
			System.out.println("'*' To Multiplication");
			System.out.println("'/' To Division");
			System.out.println("Any Other Key To Exit");
			System.out.print("Enter Your Choice: ");
			char choice = input.next().charAt(0);
			System.out.println();
			
			switch(choice){
				case '+':
					System.out.println(a+" + "+b+" = "+cal.add());
					break;
				case '-':
					System.out.println(a+" - "+b+" = "+cal.sub());
					break;
				case '*':
					System.out.println(a+" * "+b+" = "+cal.mul());
					break;
				case '/':
					System.out.println(a+" / "+b+" = "+cal.div());
					break;
				default:
					System.out.println("Program Ended.");
					System.exit(0);
			}
			System.out.println();
		}
	}
}