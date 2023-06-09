package durga.com;

public class Practise1 extends AA {
	
  public static void main(String[] args) {
	  System.out.println(Thread.currentThread().getPriority());
	AA a=new AA();
	BB b=new BB();
	a.start();
	b.start();
}
}

class AA extends Thread{
	public void run() {
		
		System.out.println(Thread.currentThread().getPriority());
	for (int i = 0; i < 10; i++) {
		System.out.println("hello");
	}
	}
}
class BB extends Thread{
	
	public void run() {
	for (int i = 0; i < 10; i++) {
		System.out.println("hello_____");
	}
	}
}