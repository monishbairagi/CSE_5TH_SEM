package Q3_Pkg2;
import Q3_Pkg1.*;

class SubFullName extends Q3_2_FullName{ // inheriting Q3_2_FullName class
		SubFullName(String n, String t){
			super(n,t);
		}
		String getName(){
			return super.name; // accessing the protected data member
		}
}

public class Q3{
	public static void main(String args[]){
		
		Q3_1_Name name = new Q3_1_Name("Monish"); // here we are using Q3_Pkg1.Q3_1_Name class
		System.out.println("\n Name: "+name.getName());
		
		Q3_2_FullName fullName = new Q3_2_FullName("Monish","Bairagi"); // here we are using Q3_Pkg1.Q3_2_FullName class
		System.out.println("\n Full Name: "+fullName.getFullName());
		
		SubFullName subFullName = new SubFullName("Monish","Bairagi"); // accessing the protected data member of Q3_Pkg1.Q3_2_FullName class
		System.out.println("\n Name: "+subFullName.getName()+"\n");

	}
}