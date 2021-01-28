import java.util.*;

class Student{
	String name;
	int roll;
	double marks;
	
	Student(String name, int roll, double marks){
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	char findGrade(){
		char grade;
		if(marks>=90){
			grade = 'O';
		}
		else if(marks>=80 && marks<90){
			grade = 'E';
		}
		else if(marks>=70 && marks<80){
			grade = 'A';
		}
		else if(marks>=50 && marks<60){
			grade = 'B';
		}
		else if(marks>=40 && marks<50){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		return grade;
	}
}

class StudentMain{
	public static void main(String[] args){
		int n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Total Number of Students: ");
		n = input.nextInt();
		Student s[] = new Student[n];
		for(int i=0;i<n;i++){
			System.out.print("\nEnter Name of Student - "+(i+1)+": ");
			input.nextLine();	// Buffer
			String name = input.nextLine();
			System.out.print("Enter Roll of Student - "+(i+1)+": ");
			int roll = input.nextInt();
			System.out.print("Enter Marks of Student - "+(i+1)+": ");
			double marks = input.nextDouble();
			s[i] = new Student(name,roll,marks);
		}
		System.out.print("\nEnter Roll of Student to Find Grade: ");
		int r = input.nextInt();
		for(int i=0;i<s.length;i++){
			if(s[i].roll == r){
				System.out.println("\nName : "+s[i].name);
				System.out.println("Roll : "+s[i].roll);
				System.out.println("Marks: "+s[i].marks);
				System.out.println("Grade: "+s[i].findGrade());
			}
		}
	}
}