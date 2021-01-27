import java.util.*;

class Rectangle{
	double length;
	double breadth;
	double area;
	
	Rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	double getArea(){
		return length*breadth;
	}
}

class Box extends Rectangle{
	double hight;
	double volume;
	
	Box(double length,double breadth,double hight){
		super(length,breadth);
		this.length = length;
		this.breadth = breadth;
		this.hight = hight;
	}
	double getVolume(){
		return length*breadth*hight;
	}
}

class BoxClass{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter length and breadth to Calculate Area: ");
		double length = in.nextInt();
		double breadth = in.nextInt();
		Rectangle r = new Rectangle(length,breadth);
		System.out.println("Area: "+r.getArea());
		
		System.out.print("Now Enter Hight to Calculate Volume: ");
		double hight = in.nextInt();
		Box b = new Box(length,breadth,hight);
		System.out.println("Volume: "+b.getVolume());
		
		System.out.println();
	}
}