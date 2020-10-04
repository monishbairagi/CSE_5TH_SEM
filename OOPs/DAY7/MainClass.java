import java.util.*;

class BoxClass{
    double hight;
    double width;
    double depth;
	
	BoxClass(double h,double w,double d){
        hight = h;
        width = w;
        depth = d;
    }
	
    void setVal(double ht,double wt,double dt){
        hight = ht;
        width = wt;
        depth = dt;
    }
    
    double calculateVolume(){
        return hight*width*depth;
    }
}


class MainClass{
    public static void main (String[] args) {
		double h, w, d, vol1, vol2;
		
		BoxClass box1 = new BoxClass(5,6,7);
        vol1 = box1.calculateVolume();
        System.out.println("Box1 Volume is: "+vol1);
		
		BoxClass box2 = new BoxClass(8,9,10);
        vol2 = box2.calculateVolume();
        System.out.println("Box2 Volume is: "+vol2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter data for Box1:-");
		System.out.print("Enter Hight:");
		h = sc.nextDouble();
		System.out.print("Enter Width:");
		w = sc.nextDouble();
		System.out.print("Enter Depth:");
		d = sc.nextDouble();
		
		box1.setVal(h,w,d);
		vol1 = box1.calculateVolume();
		System.out.println("\nBox2 Volume is: "+vol1);
		
		System.out.println("\nEnter data for Box2:-");
		System.out.print("Enter Hight:");
		h = sc.nextDouble();
		System.out.print("Enter Width:");
		w = sc.nextDouble();
		System.out.print("Enter Depth:");
		d = sc.nextDouble();
		
		box2.setVal(h,w,d);
		vol2 = box2.calculateVolume();
		System.out.println("\nBox2 Volume is: "+vol2);
		
		sc.close();
    }
}