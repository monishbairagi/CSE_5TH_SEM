interface A{
	void run(String name);
}
interface B{
	void run(String name);
}
class Run implements A,B{
	public void run(String name){
		System.out.println("\nI am "+name+"");
	}
}

class InterfaceExample{
	public static void main(String args[]){
		A a = new Run();
		a.run("Monish");
		
		B b = new Run();
		b.run("a Coder");
		
		System.out.println();
	}
}
