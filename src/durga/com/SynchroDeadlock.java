package durga.com;

public class SynchroDeadlock extends Thread {
	A a=new A();
	B b=new B();
	public void m1() {
		this .start();
		a.demo1(b);//this line execute by main thread
	}
	public void run() {
		b.demo2(a);//this line execute by child thread
	}
	public static void main(String[] args) {
		SynchroDeadlock S=new SynchroDeadlock();
		S.m1();
	}}
class A{
	public synchronized void demo1(B b) {
		System.out.println("Thread 1 execute Demo() ");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Thread 1 trying execute B last() ");
			b.last();
		}
	}
	public synchronized void last() {
		System.out.println("inside A this is last()");
	}
}
class B{
	public synchronized void demo2(A a) {
		System.out.println("Thread 2 execute Demo() ");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			System.out.println("Thread 2 trying execute A last() ");
			a.last();
		}
	}
	public synchronized void last() {
		System.out.println("inside B this is last()");	
	}
}
