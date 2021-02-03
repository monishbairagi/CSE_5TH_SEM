class Rectangle{
	double hight, width, area;
	
	Rectangle(){
		hight = -1;
		width = -1;
	}
	Rectangle(double hight,double width){
		this.hight = hight;
		this.width = width;
	}
	Rectangle(Rectangle rec){
		hight = rec.hight;
		width = rec.width;
	}
	double getArea(){
		return hight*width;
	}
}

class Box extends Rectangle{
	double depth;
	
	Box(){
		super();
		depth = -1;
	}
	Box(double hight,double width,double depth){
		super(hight,width);
		this.depth = depth;
	}
	double getVolume(){
		return hight*width*depth;
	}
}

class BoxClass{
	public static void main(String args[]){
		System.out.println();
		
		Box b1 = new Box();
		System.out.println(" Box b1 = new Box();");
		System.out.println(" Area: "+ b1.getArea());
		System.out.println(" Volume: "+ b1.getVolume() +"\n");
		
		Box b2 = new Box(10,15,20);
		System.out.println(" Box b2 = new Box(10,15,20);");
		System.out.println(" Area: "+ b2.getArea());
		System.out.println(" Volume: "+ b2.getVolume() +"\n");
		
		Rectangle r1 = b2;
		System.out.println(" Rectangle r1 = b2;");
		System.out.println(" Area: "+ r1.getArea());
		System.out.println(" Volume: "+ b2.getVolume() +"\n");
	}
}
