import java.util.*;

class ArrayClass{
	Scanner input = new Scanner(System.in);
	int a[] = new int[10];
	int odd = 0, even = 0;
	
	void take_Input(){
		System.out.print("Enter 10 Integer: ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		System.out.println();
	}
	void disp_Freq_Odd_Even(){
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Total Odd Elements: "+odd);
		System.out.print("Odd Elements Are: ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2!=0){
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("Total Even Elements: "+even);
		System.out.print("Even Elements Are: ");
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
	}
}

class ArrayMain{
	public static void main(String[] args){
		ArrayClass ac = new ArrayClass();
		ac.take_Input();
		ac.disp_Freq_Odd_Even();
	}
}