 package durga.com;

public class SynchroBlock {
	public static void main(String[] args) {
		Key1 d=new Key1();
		Key1 d1=new Key1();
	
		Board1 B=new Board1(d, "Star");
		Board1 B1=new Board1(d1, "sun");
		B.start();//when 2 object create ramdom output is get
		B1.start();
	}
}
class Key1{
	public void wish1(String name) {
	//;;;;;;;;;;;;;;;;;//1 lakh line code
	synchronized(this) {
		for (int i = 0; i < 10; i++) {
			System.out.print("good morning:");
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {}
			System.out.println(name);
			//;;;;;;;;;;;;;;;;;//1 lakh line code
		}
	}
}
}
class Board1 extends Thread{
	Key1 d;
	String name;
	public Board1(Key1 d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish1(name);
	}
}
