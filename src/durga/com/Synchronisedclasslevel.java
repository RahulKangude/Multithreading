package durga.com;

public class Synchronisedclasslevel implements Ccp, Ccp1 {
	public static void main(String[] args) {
		City c = new City();
		City c1 = new City();
		Splender S = new Splender(c);
		Splender1 S1 = new Splender1(c);
		Splender A = new Splender(c1);
		Splender1 B = new Splender1(c1);
		S.start();
		S1.start();
		A.start();
		B.start();

		Synchronisedclasslevel sl = new Synchronisedclasslevel();
		Synchronisedclasslevel s2 = new Synchronisedclasslevel();
		sl.m2();
		sl.m2();
//		s2.m2();
//		s2.m2();

	}

	@Override
	public void m2() {
		System.out.println("happy ending");

	}
}

class City {

	public static synchronized void display1() {
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
	public static void Add(){
		System.out.println("In addtion method");
	}

	public static synchronized void display2() {
		for (int i = 65; i < 75; i++) {
			System.out.print((char) i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class Splender extends Thread {
	City c;

	public Splender(City c2) {
		this.c = c2;
	}

	public void run() {
		c.display1();
		c.Add();;
	}
}

class Splender1 extends Thread {
	City c1;

	public Splender1(City c2) {
		this.c1 = c2;
	}

	public void run() {
		c1.display2();
		c1.Add();;
	}
}

interface Ccp {
	public void m2();
}

interface Ccp1 {
	public void m2();
}
