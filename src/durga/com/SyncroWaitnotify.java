package durga.com;

public class SyncroWaitnotify {
  public static void main(String[] args) throws InterruptedException {
	Go g=new Go();
	g.start();
	synchronized (g) {
		System.out.println("main in synchro block");
		g.wait();
		System.out.println("Main");
		//Thread.sleep(100);//Wait () is continuos in waiting
		System.out.println(g.total);
		System.out.println(" out of main");
	}
}
}
class Go extends Thread{
	int total =0;
	public void run() {
		synchronized (this) {
			System.out.println(" in Child synchro block");
			for (int i = 0; i <=100; i++) {
				total=total+i;
				System.out.println(" Aaaa "+i);
				
			}
			System.out.println("child out block");
			this.notify();
			System.out.println("hp");
		}
	}
}