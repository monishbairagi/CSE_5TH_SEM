class StudentStream implements Runnable{
	String streamName;
	StudentStream(String streamName){
		this.streamName = streamName;
		System.out.println(" "+streamName+" Student Wants to Ask Question.");
		Thread t = new Thread(this);
		t.start();
		try{
			t.join();
		}catch(InterruptedException e){
			System.out.println(" "+streamName+" Student Interrupted.");
		}
	}
	public void run(){
		System.out.println(" "+streamName+" Student is Asking Question.");
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			System.out.println(" "+streamName+" Student Interrupted.");
		}
		System.out.println(" "+streamName+" Student's Doubt Has Been Cleared.\n");
	}
}

class Q1{
	public static void main(String args[]){
		System.out.println("\n Interactive Session Has Been Created.\n");
		new StudentStream("CSE");
		new StudentStream("ECE");
		new StudentStream("EE ");
		new StudentStream("CE ");
		try{
			Thread.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(" Session Interrupted.");
		}
		System.out.println(" Interactive Session Has Been Ended.\n");
	}
}
