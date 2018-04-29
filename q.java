
public class q {
	int n;
	boolean valueset=false;
	
	synchronized int get(){
		if(!valueset)
			try{
				wait();
				
			}
		catch(InterruptedException e){
			System.out.println("Interrupted");
		}
		System.out.println("Got: "+this.n);
		valueset=false;
		notify();
		return n;
	}
	synchronized void put(int p){
		if(valueset)
			try{
				wait();
			}
		catch(InterruptedException e){
			System.out.println("Interrupted Execution");
		}
		this.n=p;
		valueset=true;
		System.out.println("Put: "+n);
		notify();
	}

	
}
