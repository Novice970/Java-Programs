package ThreadPrograms;
class Ticker{
	static int total;
	public synchronized void tick(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+ ": "+ i);
			total+=i;
		}
	}
}
public class WaitAndNotify {
	public static void main(String[] args)throws InterruptedException{
		Runnable r1= new Runnable(){
			public void run(){
				Ticker t=new Ticker();
				t.tick();
			}
		};
		
		Thread t1=new Thread(r1,"One ");
		t1.start();
		t1.join();
		System.out.println("Total  :  "+Ticker.total);
		
		new Thread(r1,"Two").start();
	}

}
