package ThreadPrograms;

public class Thread1 extends Thread{
	public void run(){
		for(int i=0;i<15;i++){
			System.out.println("Child Thread");
		}
	}
}
