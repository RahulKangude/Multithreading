package durga.com;

public class SynchronizedDemo {
	public static void main(String[] args) {
		Display d=new Display();
		Display d1=new Display();
		Realme R=new Realme(d, "Rahul");
		Realme P=new Realme(d, "Pranav");
		Realme R1=new Realme(d1, "om");
		Realme P1=new Realme(d1, "Aditya");
		R.start();
		P.start();
		P1.start();
		R1.start();
	}
}
class Display{
	public   void wish(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(10);
			} catch(InterruptedException e) {}
			System.out.println(name);
		}
		}
//		public synchronized void wish1(String name) {
//			for (int i = 0; i < 10; i++) {
//				System.out.print("good:");
//				try {
//					Thread.sleep(100000);
//				} catch(InterruptedException e) {}
//				System.out.println(name);
//			}
	}

class Realme extends Thread{
	Display d;
	String name;
	public Realme(Display d, String name) {
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish(name);
	}

}