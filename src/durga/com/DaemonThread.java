package durga.com;

public class DaemonThread {
  public static void main(String[] args) {
	System.out.println(Thread.currentThread().isDaemon());
//	Thread.currentThread().setDaemon(true);//impossible the change the nature of main thread
	
	DemoD t=new DemoD();
	System.out.println(" chils is daemon "+ t.isDaemon());
	t.setDaemon(true);
	System.out.println("set it child thread is daeman ="+t.isDaemon());
	t.setDaemon(true);
	t.start();
	for (int i = 0; i < 10; i++) {
	}
	System.out.println("main thread ends");	
	
}
}

class DemoD extends Thread{
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("child thread");
				sleep(100);
			}catch(InterruptedException e) {}
			
		}
		
	}
}