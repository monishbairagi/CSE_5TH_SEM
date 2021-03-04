package Q3_Pkg1;

public class Q3_2_FullName{
	protected String name; // data member can be access from other packages
	String title; // data member can be accessed from this package only
	public Q3_2_FullName(String n, String t){
		name = n;
		title = t;
	}
	public String getFullName(){
		return(name+" "+title);
	}
}