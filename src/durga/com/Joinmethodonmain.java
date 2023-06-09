package durga.com;

public class Joinmethodonmain {
	public static void main(String[] args) throws InterruptedException {
		Demo1 D =new Demo1();
		D.start();//D.join call in main thread then its Stop execution and complete chlid thread execution 
	//	D.join();//join method 3 type 
	//	D.join(10000);//join ( long mill second)  
		D.join(10000,100);//join ( long mill second,int nano seconds)  
		for(int i=0;i<10;i++) {
			System.out.println("Rama thread");
		}
	}
} 
class  Demo1 extends Thread{
	public void run(){
		for(int i=0;i<10;i++) {
			System.out.println("seeta thread");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {				
			}
		}
	}
}
