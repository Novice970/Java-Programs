class Q{
	int n;
	boolean valueset=false;
	
	synchronised int get(){
		if(!valueset)
			try{
				wait();
			}
		catch(InterruptedException e){
			System.out.println("interrupted excepton");
		}
		System.out.println("got "+n);
		valueset=false;
		notify();
		return n;
	}
	synchronised void put(int n){
	 if(valueset)
		 try{
			 wait();
		 }
	 catch(InterruptedException e){
		 System.out.println("Interrrupted Exception caught");
		 
	 }
	 valueset=true;
	 System.out.println("put: "+n);
	 notify();
	 
	}
}
class producer implements Runnable{
	Q q;
	producer(Q q){
		this.q=q;
		new Thread(this,"producer").start();
		
	}
	public void run(){
		int i=0;
		while(true){
			q.put(i++);
			
		}
	}
}
class consumer implements Runnable{
	Q q;
	consumer(Q q){
		this.q=q;
		new Thread(this,"comsumer").start();
	}
	public void run(){
		while (true){
			q.get();
		
		}
	}
}
public class pcfixed {
	public static void main(String[] args){
		Q q=new Q();
		new producer(q);
		new consumer(q);
		
		System.out.println("press ctrl+c to stop");
		
	}
	

}
