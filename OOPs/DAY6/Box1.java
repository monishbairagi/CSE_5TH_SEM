import java.util.*;

class BoxClass{
    double hight;
    double width;
    double depth;
    
    double calculateVolume(){
        return hight*width*depth;
    }
}


class Box1{
    public static void main (String[] args) {
		double h, w, d;
        BoxClass box = new BoxClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Hight:");
		h = sc.nextDouble();
		System.out.print("Enter Width:");
		w = sc.nextDouble();
		System.out.print("Enter Depth:");
		d = sc.nextDouble();
		sc.close();

        box.hight = h;
        box.width = w;
        box.depth = d;
        double vol = box.calculateVolume();
        System.out.println("Volume is: "+vol);
    }
}