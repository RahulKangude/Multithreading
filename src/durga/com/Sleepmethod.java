package durga.com;

public class Sleepmethod {
	public static void main(String[] args) {
		Light.mt = Thread.currentThread();
		Light l = new Light();
		l.start();
		l.interrupt();
		for (int i = 1; i <= 10; i++) {
			System.out.println("Slide-->>" + i);
		}
	}
}

class Light extends Thread {
	public static Thread mt;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("light");
		}
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				System.out.println("light");
			}
		} catch (InterruptedException e) {
			System.out.println("i got intrapted");
		}
	}

}