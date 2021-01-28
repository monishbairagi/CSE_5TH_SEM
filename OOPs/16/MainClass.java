class AnyVarClass{
	AnyVarClass(){
		System.out.println("Have not assigned any value.\n");
	}
	AnyVarClass(int i){
		System.out.println("Type: int & Value: "+i+"\n");
	}
	AnyVarClass(double d){
		System.out.println("Type: double & Value: "+d+"\n");
	}
	AnyVarClass(String s){
		System.out.println("Type: String & Value: '"+s+"'\n");
	}
	AnyVarClass(String s, int i){
		System.out.println("Type: String, int & Value: '"+s+"', "+i+"\n");
	}
	/* So on */
}

class MainClass{
	public static void main(String[] args){
		System.out.println();
		AnyVarClass var1 = new AnyVarClass();
		AnyVarClass var2 = new AnyVarClass(1234);
		AnyVarClass var3 = new AnyVarClass(12.34);
		AnyVarClass var4 = new AnyVarClass("Monish");
		AnyVarClass var5 = new AnyVarClass("Monish", 37);
	}
}