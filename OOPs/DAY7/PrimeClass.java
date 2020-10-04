import java.util.*;

class Prime{
	Prime(int n){
		for(int i=1;i<=n;i++){
			int flag=1;
			for(int j=2;j<i;j++){
				if(i%j==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}

class PrimeClass{
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Upper Limit: ");
		n = sc.nextInt();
		sc.close();
		Prime p = new Prime(n);
	}
}