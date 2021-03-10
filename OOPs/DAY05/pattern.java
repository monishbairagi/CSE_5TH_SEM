import java.util.*;

class GenPattern{
	int n;
	Scanner sc = new Scanner(System.in);
	
	void getData(){
		System.out.print("Enter a Number:");
		n = sc.nextInt();
		while(n%2==0){
			System.out.println("\nNumber Should be Odd. Try Again.");
			System.out.print("Enter a Number:");
			n = sc.nextInt();
		}
		sc.close();
	}
	
	void printPattern(){
		for(int i=1;i<=(n/2)+1;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=n/2;i++){
			for(int j=i;j<=(n/2);j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("Thank you for using this program.\nHave a Nice day.");
	}
}

class pattern{
	public static void main(String[] args){
		GenPattern gp = new GenPattern();
		gp.getData();
		gp.printPattern();
	}
}