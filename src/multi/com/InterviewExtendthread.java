package multi.com;

public class InterviewExtendthread {
	public static void main(String[] args) {
		Interview i = new Interview();
		i.start();
		for (int j = 0; j < 10; j++) {
			System.out.println("main method");
		}
	}
}

class Interview extends Thread {

	public void start() {
		super.start();
		System.out.println("start method");
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");

		}
	}
}