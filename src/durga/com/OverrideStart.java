package durga.com;

public class OverrideStart {
	public static void main(String[] args) {
		Pro p = new Pro();
		p.start();
//	p.start();//java.lang.IllegalThreadStateException
		System.out.println("main thread ");
	}

}

class Pro extends Thread {
	public void start() {
		super.start();
		System.out.println("start method");
	}

	public void run() {
		System.out.println("run method ");
	}
}