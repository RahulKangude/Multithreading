
package durga.com;

public class Yieldmethod {
    public static void main(String[] args) {
		Hp h=new Hp();
		h.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main  thread");
			Thread.yield();

		}
	}
}
class Hp extends Thread{
	public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("child thread");
			}
	}
}