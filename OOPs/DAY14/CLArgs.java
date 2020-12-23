class StringInfo{
	String[] s;
	
	StringInfo(String[] s){
		this.s = s;
	}
	int chk_Arg(){
		System.out.println();
		if(s.length < 3){
			System.out.println("Total Number of Arguments is "+s.length+", Which is Less than Three.");
		}else if(s.length == 3){
			System.out.println("Total Number of Arguments is Three.");
		}else{
			System.out.println("Total Number of Arguments is "+s.length+", Which is Grater than Three.");
		}
		System.out.println();
		return s.length;
	}
	void find_Vowel(){
		System.out.println();
		for(int i=0;i<s.length;i++){
			int v = 0;
			for(int j=0;j<s[i].length();j++){
				if(s[i].charAt(j)=='a' || s[i].charAt(j)=='e' || s[i].charAt(j)=='i' || s[i].charAt(j)=='o' || s[i].charAt(j)=='u' || s[i].charAt(j)=='A' || s[i].charAt(j)=='E' || s[i].charAt(j)=='I' || s[i].charAt(j)=='O' || s[i].charAt(j)=='U'){
					v++;
				}
			}
			System.out.println((i+1)+") '"+s[i]+"' has "+v+" Vowels.");
		}
		System.out.println();
	}
}
public class CLArgs{
	public static void main(String[] args){
		StringInfo si = new StringInfo(args);
		if(si.chk_Arg() >= 3){
			si.find_Vowel();
		}
	}
}