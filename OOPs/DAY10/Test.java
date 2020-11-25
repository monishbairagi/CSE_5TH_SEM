import java.util.*;

class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Size of the array: ");
		int n = input.nextInt();
		int[] a = new int[n];
		System.out.print("Enter "+n+" elements to compute sum: ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		int s = 0, lergest = 0, smallest = 9999;
		for(int i=0;i<a.length;i++){
			if(a[i]>lergest){
				lergest = a[i];
			}
			if(a[i]<smallest){
				smallest = a[i];
			}
			s += a[i];
		}
		System.out.println("\nSum of the array elements is "+s);
		System.out.println("Lergest Element of the array is "+lergest);
		System.out.println("Smallest Element of the array is "+smallest);
		System.out.println();
		input.close();
	}
}