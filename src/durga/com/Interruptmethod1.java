package durga.com;

public class Interruptmethod1 {
	public static void main(String[] args) {
		Demoout d=new Demoout();
		d.start();
		d.interrupt();
		System.out.println("End of main thread !!!!!!!!");
	}
}
class Demoout extends Thread {
	public void run() {
		for (int i = 0; i <=100; i++) {
			System.out.println("I am lazy!!!!!!"+(i));
		}
		System.out.println("welcome to java");
		try {
			for (int i = 0; i <=100; i++) {
				System.out.println("sleeping state "+(i+i));	
			    Thread.sleep(100);
		}}
		catch( InterruptedException e) {
			System.out.println("i got interrupted by interrupt method !!!!!!!!!!!! ");
		}
		finally {
			System.out.println("finally");
		}
	}
}

