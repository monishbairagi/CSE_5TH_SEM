import java.util.*;

class Thr extends Thread{
	Thread t;
	Thr(){
		t = new Thread(this);
		t.start();
	}
	public void run(){
		System.out.println("Thread-Info: "+Thread.currentThread()+"\n");
	}
}
class ThrThr{
	public static void main(String args[]){
		System.out.println("\nCreating Thread using Thread Class:-");
		System.out.println("------------------------------------");
		System.out.println("\nThread-Info: "+Thread.currentThread()+"\n");
		Thr t = new Thr();
	}
}
