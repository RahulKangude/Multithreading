package durga.com;

public class Interruptmethod11 extends Thread  {
	public static void main(String[] args) {
		Demoin1 d = new Demoin1();
		d.start();
		d.interrupt();
		Interruptmethod11 dd=new Interruptmethod11();

		System.out.println("End of main thread ");
	}
}

class Demoin1 extends Thread {
	static Thread mt;

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("I am lazy");
				Thread.sleep(1000);
				//mt.join(100);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted ");
		}
		System.out.println("________________________________");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thar=" + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("i got interrupted thar ");
		}
	}
}