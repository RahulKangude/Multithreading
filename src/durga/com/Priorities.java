package durga.com;

public class Priorities {
  public static void main(String[] args) {
	  System.out.println("main thread old priority-->>"+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(2); //setting new priority of main thread 
		Dell l=new Dell();
		System.out.println("new priority ="+l.getPriority());
		
		Dell D=new Dell();
        D.setPriority(10);
        D.start();
		for (int i = 0; i < 20; i++) {
			System.out.println("main thread ");
		}		
}
}

class Dell extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("child  thread ");
		}
		
	}
}