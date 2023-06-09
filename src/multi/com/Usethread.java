package multi.com;

public class Usethread extends Thread {
	//	public void start() {
	//		System.out.println("start method call");
	//	}
	public static void main(String[] args) {//default thread
		System.out.println("++++++++++main method+++++++++++++");
		Usethread d1=new Usethread();
		Mango m1=new Mango();
		d1.start();//resister this newly created with a paost of os called ""thread schedular;
		m1.start();//resister this newly created with a paost of os called ""thread schedular;
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello");
		}
		System.out.println("**************************");  

	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("java...");
		}
	}


}

class Mango extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("mango...");
		}

	}
}
