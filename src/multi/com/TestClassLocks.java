package multi.com;

public class TestClassLocks extends Thread{
public static void main(String[] args) {
	TestClassLocks t=new TestClassLocks();
	TestClassLocks t3=new TestClassLocks();
	t.Add();
	t.display1();
	t.display2();
	t.start();
	t3.Add();
	t3.display1();
	t3.display2();
	t3.start();
	
}
public void run() {
	TestClassLocks t1=new TestClassLocks();
	TestClassLocks t2=new TestClassLocks();
	t1.Add();
	t1.display1();
	t1.display2();
	t2.Add();
	t2.display1();
	t2.display2();
}


		public static synchronized void display1() {
			for (int i = 1; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
		public  void Add(){
			System.out.println("In addtion method");
		}

		public  void display2() {
			for (int i = 65; i < 75; i++) {
				System.out.println((char) i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
	
}
class TestClass{
	
}