package durga.com;

public class Joindemo1 {
	public static void main(String[] args) {
		Asus A = new Asus();
		A.start();
		try {
			A.join(100);
		} catch (InterruptedException e) {
			System.out.println("i got interrupted");
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("main  laptop");
		}
	}
}

class Asus extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("chlid laptop");
				Thread.sleep(10);
			} catch (InterruptedException e) {
			}
		}
	}
}