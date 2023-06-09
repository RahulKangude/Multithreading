package durga.com;

public class SynchronizedBlock {
	public static void main(String[] args) {
		Key d=new Key();
		Board B=new Board(d, "Hp");
		Board B1=new Board(d, "Dell");
		B.start();
		B1.start();
	}
}
class Key{
	public  void wish1(String name) {
	//;;;;;;;;;;;;;;;;;//1 lakh line code
	synchronized(this) {
		System.out.println("");
		for (int i = 0; i < 10; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
			System.out.println(name);
		}
		System.out.println("2222222222222222222222");
		//;;;;;;;;;;;;;;;;;//1 lakh line code
	}
}
}
class Board extends Thread{
	Key d;
	String name;
	public Board(Key d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish1(name);
	}
}
