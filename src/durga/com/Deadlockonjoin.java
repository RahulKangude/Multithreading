package durga.com;

public class Deadlockonjoin {
public static void main(String[] args) throws InterruptedException {
	//Thread.currentThread().join();// deadlock or program  is stacked
	Demodead.mt= Thread.currentThread();
	Demodead d=new Demodead();
	d.start();
	//d.join();
	for (int i = 0; i < 10; i++) {
		System.out.println("main thread");
		Thread.sleep(1000);	
	}
}
}
class Demodead extends Thread{
	public static Thread mt;
	public void run() {
	
			try {
				mt.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		for (int i = 0; i < 10; i++) {
			System.out.println("India is my country");
	}
	}	}
