import java.util.*;

class SumMaxMin{
	int[] a;
	
	SumMaxMin(int[] a){
		this.a = a;
	}
	
	int sum(){
		int s = 0;
		for(int i=0;i<a.length;i++){
			s += a[i];
		}
		return s;
	}
	
	int max(){
		int lergest = -9999;
		for(int i=0;i<a.length;i++){
			if(a[i]>lergest){
				lergest = a[i];
			}
		}
		return lergest;
	}
	
	int min(){
		int smallest = 9999;
		for(int i=0;i<a.length;i++){
			if(a[i]<smallest){
				smallest = a[i];
			}
		}
		return smallest;
	}
}

class OOPSumMaxMin{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Size of the array: ");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.print("Enter "+n+" elements to compute sum: ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		
		SumMaxMin smm = new SumMaxMin(a);
		
		System.out.println("\nSum of the array elements is "+smm.sum());
		System.out.println("Lergest Element of the array is "+smm.max());
		System.out.println("Smallest Element of the array is "+smm.min());
		System.out.println();
		input.close();
	}
}