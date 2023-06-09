package durga.com;

public class JoindDemo2 {
  public static void main(String[] args) throws InterruptedException  {
	India.rr=Thread.currentThread();
	India i=new India();
	i.start();
	for (int j = 0; j < 10; j++) {
		System.out.println("maharatastra is my state");
		Thread.sleep(100);
	}
}
}
class India extends Thread{
	public static Thread rr;
	public void run() {
		try {
			rr.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("India is my country");
	}
	}
}