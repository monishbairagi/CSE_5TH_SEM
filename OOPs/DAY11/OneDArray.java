import java.util.*;

class FindSameElements{
	Scanner input = new Scanner(System.in);
	int n, a[];
	
	void take_Input(){
		System.out.print("\nEnter Size of the Array: ");
		n = input.nextInt();
		a = new int[n];
		System.out.print("\nEnter "+n+" Elements: ");
		for(int i=0;i<a.length;i++){
			a[i] = input.nextInt();
		}
	}

	void search_Occurrences(){
		int n1, sa[][];
		System.out.print("\nEnter Total Number of Elements to Search: ");
		n1 = input.nextInt();
		sa = new int[2][n1];
		System.out.print("\nEnter "+n1+" Elements to Search: ");
		for(int i=0;i<sa[0].length;i++){
			sa[0][i] = input.nextInt();
			for(int j=0;j<a.length;j++){
				if(sa[0][i]==a[j]){
					sa[1][i]++;
				}
			}
		}
		System.out.println();
		for(int i=0;i<sa[0].length;i++){
			System.out.println(sa[0][i]+" is Present "+sa[1][i]+" Times.");
		}
	}
}

class OneDArray{
	public static void main(String[] args){
		FindSameElements fse = new FindSameElements();
		fse.take_Input();
		fse.search_Occurrences();
	}
}