class A{
	void show(){
		System.out.println("We are in Super-Class");
	}
}
class B extends A{
	void show(){
		System.out.println("We are in Sub-Class");
	}
	void superShow(){
		super.show();
	}
}

class Test{
	public static void main(String[] args){
		B b = new B();
		
		b.show();
		b.superShow();
	}
}