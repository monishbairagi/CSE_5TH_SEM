class Variable{
	Variable(){
		System.out.println("Have not assigned any value.\n");
	}
	Variable(int i){
		System.out.println("Type: int & Value: "+i+"\n");
	}
	Variable(double d){
		System.out.println("Type: double & Value: "+d+"\n");
	}
	Variable(String s){
		System.out.println("Type: String & Value: '"+s+"'\n");
	}
	Variable(String s, int i){
		System.out.println("Type: String, int & Value: '"+s+"', "+i+"\n");
	}
	/* So on */
}

class OverLoad{
	public static void main(String[] args){
		System.out.println();
		Variable var1 = new Variable();
		Variable var2 = new Variable(1234);
		Variable var3 = new Variable(12.34);
		Variable var4 = new Variable("Monish");
		Variable var5 = new Variable("Monish", 37);
	}
}