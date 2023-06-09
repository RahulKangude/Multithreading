package multi.com;

public class JoinMethod1 extends Thread {
	public static void main(String[] args) throws InterruptedException {
//  System.out.println("main "+Thread.currentThread().getPriority());
//   Thread.currentThread().setPriority(1);
//   System.out.println(Thread.currentThread().getPriority());
		Bag.mt = Thread.currentThread();
		Bag b = new Bag();
		b.start();
		for (int i = 0; i < 15; i++) {
			b.join();
			System.out.println("main class");
		}

	}
}

class Bag extends Thread {
	public static Thread mt;

	public void run() {
//		System.out.println("child "+Thread.currentThread().getPriority());
//	Thread.currentThread().setPriority(10);
//	System.out.println("child "+Thread.currentThread().getPriority());
		for (int i = 0; i < 15; i++) {
//			try {
//				mt.join();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}// deadlock situation occures
			System.out.println("bag class");
		}

	}
}