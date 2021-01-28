import java.util.Scanner;

class AppleClass{
	static double PRICE;
	double weight;
	AppleClass(double weight){
		this.weight = weight;
	}
}

class AppleMain{
	public static void main(String[] args){
		double totalWeight = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter The Price (Rs.) of Apple/Gram: ");
		AppleClass.PRICE = input.nextDouble();
		System.out.print("Enter Total Number of Apples: ");
		AppleClass apple[] = new AppleClass[input.nextInt()];
		for(int i=0;i<apple.length;i++){
			System.out.print("Enter Weight (Gram) of Apple - "+(i+1)+": ");
			apple[i] = new AppleClass(input.nextDouble());
		}
		for(int i=0;i<apple.length;i++){
			totalWeight += apple[i].weight;
		}
		double totalPrice = totalWeight*AppleClass.PRICE;
		System.out.println("\nThe Total Cost of All Apples is "+totalPrice+"\n");
	}
}