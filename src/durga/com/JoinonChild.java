package durga.com;

public class JoinonChild {
	public static void main(String[] args) throws InterruptedException {
		Demo.mt= Thread.currentThread();
		Demo d=new Demo();
		d.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
			Thread.sleep(1000);
		}
	}
	}
class Demo extends Thread{
	static Thread mt;
	public void run() {
			try {
				mt.join(5000 );
			} catch (InterruptedException e) {				
				
			}
		
	for (int i = 0; i < 10; i++) {
		System.out.println("child thread");
	}
}}