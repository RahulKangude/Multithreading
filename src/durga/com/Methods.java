package durga.com;

public class Methods {
    public static void main(String[] args) throws InterruptedException {
		System.out.println("current thread-->>"+Thread.currentThread().getName());//getname ,setName method 
		Laptop l=new Laptop();
		l.start();
		//Thread.sleep(100);
		System.out.println(l.getName());
		Thread.currentThread().setName("Rahul");
		System.out.println("main thread name s--"+Thread.currentThread().isAlive());
		System.out.println("get  main priorites=="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(1);
		System.out.println("set new priorites=="+Thread.currentThread().getPriority());
	}
}
class Laptop extends Thread{
	@Override
	public void run() {
		System.out.println("chlid class thread name-"+Thread.currentThread().getName());
       Thread.currentThread().setName("Banana");
       System.out.println("chlid new  class thread name-"+Thread.currentThread().getName());
		System.out.println("child before priority "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
        System.out.println("child  after priority "+Thread.currentThread().getPriority());
	}
}