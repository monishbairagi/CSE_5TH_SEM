package Q3_Pkg1;

public final class Q3_1_Name{ // class can't be inherited
	String name;
	public Q3_1_Name(String n){
		name = n;
	}
	public final String getName(){ // method can't be overridden
		return name;
	}
}