package ThreadPrograms;
class Callme{
	synchronized void call(String msg){
		System.out.print("["+ msg );
		try{
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Interrupted..");
		}
		System.out.println("]");
	}
}

class Caller implements Runnable{
	Thread t;
	String msg;
	Callme ob;
	Caller(Callme ref, String str){
		ob=ref;
		msg=str;
		t=new Thread(this);
		t.start();
	
	}
	
	public void run(){
		ob.call(msg);
	}
}

public class Sync {
	public static void main(String[] args){
		Callme obj= new Callme();
		Caller ob1=new Caller(obj, "One");
		Caller ob2=new Caller(obj, "Two");
		Caller ob3=new Caller(obj, "Three");
		
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Interrupted main ");
		}
	}

}
