import java.util.*;

class SortArray{
	int a[];
	
	void get_Data(int[] a){
		this.a = a;
	}
	void sort_Data(){
		for(int i=0;i<a.length;i++){	// Bubble Sort
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
	}
	void disp_Data(){
		System.out.print("\nArray After Sorting: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println("\n");
	}
}

class Sort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("\nEnter Total Number of Elements: ");
		n = input.nextInt();
		int a[] = new int[n];
		System.out.print("\nEnter "+n+" Elements: ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
		SortArray sa = new SortArray();
		sa.get_Data(a);
		sa.sort_Data();
		sa.disp_Data();
	}
}