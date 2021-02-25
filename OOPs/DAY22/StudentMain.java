package StudentPack;

abstract class Student{
	String name;
	int roll;
	int grade;
	Student(String name,int roll,int grade){
		this.name = name;
		this.roll = roll;
		this.grade = grade;
	}
	abstract void putData();
}

class Stdnt extends Student{
	Stdnt(String name,int roll,int grade){
		super(name,roll,grade);
	}
	void putData(){
		System.out.println("Name:	" + super.name);
		System.out.println("Roll:	" + super.roll);
		System.out.println("Grade:	" + super.grade);
	}
}

class StudentMain{
	public static void main(String[] args){
		Stdnt s = new Stdnt("Monish Bairagi",37,95);
		s.putData();
	}
} 