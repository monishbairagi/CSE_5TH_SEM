import java.util.*;

class AddNum{
	int a, b, c;
	Scanner sc = new Scanner(System.in);

	void add(){
		System.out.print("Enter 1st Number: ");
		a = sc.nextInt();
		System.out.print("Enter 2st Number: ");
		b = sc.nextInt();
		c = a + b;
	}

	void printSum(){
		System.out.println("Sum is "+ c +".");
	}
} 


public class AddClass{
	public static void main(String[] args){
		AddNum a = new AddNum();
		a.add();
		a.printSum();
	}
}