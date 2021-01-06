import java.util.*;

class StringSortClass{
	String sentence, words[];
	
	StringSortClass(String sentence){
		this.sentence = sentence.toLowerCase();
		words = sentence.split(" ");
	}
	boolean isOk(){
		int k = 0;
		char c[] = new char[words.length];
		boolean flag = true;
		for(int i=0;i<words.length;i++){
			int ascii = (int)words[i].charAt(0);
			if(ascii>32 && ascii<65){
				c[k++] = words[i].charAt(0);
				flag = false;
			}
		}
		if(flag){
			return true;
		}else{
			System.out.print("\nYou have Some Words, Which Starting With ");
			for(int i=0;i<c.length;i++){
				System.out.print(words[i].charAt(0)+" ");
			}
			System.out.println(".");
			return false;
		}
	}
	String getInAscendingOrder(){
		for(int i=0;i<words.length;i++){
			for(int j=i;j<words.length;j++){
				if(words[i].compareTo(words[j])>0){
					String t = words[i];
					words[i] = words[j];
					words[j] = t;
				}
			}
		}
		return String.join(" ",words);
	}
	String getInDescendingOrder(){
		for(int i=0;i<words.length;i++){
			for(int j=i;j<words.length;j++){
				if(words[i].compareTo(words[j])<0){
					String t = words[i];
					words[i] = words[j];
					words[j] = t;
				}
			}
		}
		return String.join(" ",words);
	}
}
class StringSort{
    public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		String t;
		System.out.print("Enter Your Sentence: ");
		String s = input.nextLine();
		StringSortClass ssc = new StringSortClass(s);
		
		if(ssc.isOk()){
			System.out.println("\n1. To Sort in Ascending Order");
			System.out.println("2. To Sort in Descending Order");
			System.out.print("Enter Your choice: ");
			int ch = input.nextInt();
			switch(ch){
				case 1:
					t = ssc.getInAscendingOrder();
					System.out.println("\nString in Ascending Order: '"+t+"'\n");
					break;
				case 2:
					t = ssc.getInDescendingOrder();
					System.out.println("\nString in Descending Order: '"+t+"'\n");
					break;
				default:
					System.out.println("\nWrong input! Try Again.");
			}
		}else{
			System.out.println("\nWrong input! Try Again.\n");
		}
    }
}