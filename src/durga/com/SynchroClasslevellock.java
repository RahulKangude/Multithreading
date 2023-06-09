package durga.com;

public class SynchroClasslevellock {
	public static void main(String[] args) {
		Key2 d=new Key2();
		Key2 d1=new Key2();
		Board2 B=new Board2(d, "point");
		Board2 B1=new Board2(d1, "Grade");
		B.start();
		B1.start();
	}
}
class Key2{
	public void wish1(String name) {
	//;;;;;;;;;;;;;;;;;//1 lakh line code
	synchronized(Key2.class) {//class level lock  when 2 object crate output is sequentioal
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
class Board2 extends Thread{
	Key2 d;
	String name;
	public Board2(Key2 d, String name) {
		super();
		this.d = d;
		this.name = name;
	}
	public void run() {
		d.wish1(name);
	}
}

