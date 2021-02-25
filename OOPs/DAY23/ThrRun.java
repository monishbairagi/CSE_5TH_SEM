import java.util.*;

class Thr implements Runnable{
	Thread t;
	Thr(){
		t = new Thread(this);
		t.start();
	}
	public void run(){
		System.out.println("Thread-Info: "+Thread.currentThread()+"\n");
	}
}
class ThrRun{
	public static void main(String args[]){
		System.out.println("\nCreating Thread using Runnable Interface:-");
		System.out.println("------------------------------------------");
		System.out.println("\nThread-Info: "+Thread.currentThread()+"\n");
		Thr t = new Thr();
	}
}
