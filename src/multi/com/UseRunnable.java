package multi.com;

public class UseRunnable  implements Runnable {
	public static void main(String[] args) {//default thread
		System.out.println("main method");
		Usethread d1=new Usethread();
		Onion m1=new Onion();
        Thread t1=new Thread(d1);
  //      Thread t2=new Thread();
		t1.start();//resister this newly created with a paost of os called ""thread schedular;
		m1.start();//resister this newly created with a paost of os called ""thread schedular;
		for (int i = 0; i < 10; i++) {
			System.out.println("TVs");
		}
		System.out.println("_______________"); 
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thar...");
		}
	}
}
class Onion extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Onion...");
		}	
	}}