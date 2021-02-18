interface Name{
	String name = "Monish";
}
interface FullName extends Name{
	String surname = "Bairagi";
}
class Age{
	int age = 21;
	void printAllData(){
		System.out.println("Name:		"+age);
	}
}
class AllInfo extends Age implements FullName{
	void printAllData(){
		System.out.println("Name:		"+name);
		System.out.println("Surname:	"+surname);
		System.out.println("Age:		"+age);
	}
}

class InterfaceExample2{
	public static void main(String args[]){
		
		Age a = new Age();
		AllInfo n = new AllInfo();
		Age ref;
		
		System.out.println();
		ref = a;
		a.printAllData();
		
		System.out.println();
		ref = n;
		n.printAllData();
	}
}
