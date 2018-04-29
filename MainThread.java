
public class MainThread extends Thread{
	public static void main(String[] args){
		Thread t= Thread.currentThread();
		System.out.println("Current thread :"+t);
		t.setName("Main wala");
		System.out.println("After setting the name :"+t.getName());
		try{
			for(int n=5;n>0;n--){
				System.out.println("Sleep "+n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){
			System.out.println("Main thread interrupted");
		}
		
	}
}
