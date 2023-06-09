
package durga.com;

public class ImplementsRunnbable {
	public static void main(String[] args) throws InterruptedException {
		Star.mt=Thread.currentThread(); 
	Star s=new Star();
	Thread t=new Thread(s);
	t.start();
	for (int i = 0; i < 10; i++) {
		//t.join();
		System.out.println("main thread ");
	}
	
	}
}
class Star implements Runnable{

	public static Thread mt;
	@Override   //to abstract method of run give a body in concrete class 
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread ");
			
		}
	}
	
}