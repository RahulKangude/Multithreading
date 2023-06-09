package multi.com;

public class Zebra {
  public static void main(String[] args) throws InterruptedException {
	  System.out.println("main before");
	Thread.currentThread().sleep(70);;
	System.out.println("main after ");
}
}
