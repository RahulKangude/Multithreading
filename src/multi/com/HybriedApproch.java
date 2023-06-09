package multi.com;

public class HybriedApproch implements Runnable {// in hybrid approch both extends thread and
	public static void main(String[] args) {// implements Runnable
		Bottle B = new Bottle();
		B.start();

		HybriedApproch c = new HybriedApproch();
		Thread t = new Thread(c);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread HybriedApproch ");
		}
	}
}

class Bottle extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

}