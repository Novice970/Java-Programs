package ThreadPrograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Foop extends Thread{
	String name;
	Foop(String name){
		super(name);
		this.name=name;
		this.start();
		
	}
	
	public void run(){
		
		 for(int i=0;i<5;i++){
			 System.out.println(currentThread().getName()+ " : "+ i);
		 }
		 System.out.println(currentThread().getName()+" Ended ");
		
		
	}
}

public class tryagain {
	public static void main(String[] args) throws Exception{
		ExecutorService ex=  Executors.newFixedThreadPool(3);
		
		ex.execute(new Foop("One"));
		ex.execute(new Foop("Two"));
		ex.execute(new Foop("Three"));
		ex.execute(new Foop("Four"));
		
		ex.shutdown();
		System.out.println("Finished");
		
	}
}
