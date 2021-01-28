import java.util.*;

class ArrayClass{
	Scanner input = new Scanner(System.in);
	int a[][] = new int[2][10];
	int odd = 0, even = 0;
	
	void take_Input(){
		System.out.print("Enter 10 Integer: ");
		for(int i=0;i<a[0].length;i++){
			a[0][i] = input.nextInt();
			if(a[0][i]%2==0){
				a[1][i] = 1;
			} else {
				a[1][i] = 0;
			}
		}
		System.out.println();
	}
	void disp_Freq_Odd_Even(){
		for(int i=0;i<a[0].length;i++){
			if(a[1][i]==1){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Total Odd Elements: "+odd);
		System.out.print("Odd Elements Are: ");
		for(int i=0;i<a[0].length;i++){
			if(a[1][i]==0){
				System.out.print(a[0][i]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Total Even Elements: "+even);
		System.out.print("Even Elements Are: ");
		for(int i=0;i<a[0].length;i++){
			if(a[1][i]==1){
				System.out.print(a[0][i]+" ");
			}
		}
		System.out.println();
		System.out.println();
	}
}

class TwoDArrayMain{
	public static void main(String[] args){
		ArrayClass ac = new ArrayClass();
		ac.take_Input();
		ac.disp_Freq_Odd_Even();
	}
}