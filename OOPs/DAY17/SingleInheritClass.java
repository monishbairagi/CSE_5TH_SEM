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

class SingleInheritClass{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Two Numbers: ");
		double a = in.nextInt();
		double b = in.nextInt();
		
		AddAndSub num = new AddAndSub();
		
		num.takeNumbers(a,b);
		System.out.println(a+" + "+b+" = "+num.getAddition());
		System.out.println(a+" - "+b+" = "+num.getSubtraction());
		System.out.println();
	}
}