package multi.com;

public class ImplementsRunnable {
  public static void main(String[] args) {
	Glass g=new Glass();
	Thread t1=new Thread(g);
	Thread t2=new Thread();
	t1.start();
//	t2.start();
	for (int i = 0; i < 10; i++) {
		System.out.println("main thread ");
	}
}
}
class Glass implements Runnable{
 
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread ");
		}
		
	}

	
}