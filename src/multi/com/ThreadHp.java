package multi.com;

public class ThreadHp extends Thread
{
	
	public static void main(String arg[])
	{
		ThreadHpz t = new ThreadHpz();
		t.start();
		System.out.println("main method");
	}
}
class ThreadHpz
{
	 void run()
	{
		System.out.println("run method");
	}
	 void start()
	{
		//super.start();
		System.out.println("start() method");
	}
}

