
public class Caller implements Runnable{
	Thread t;
	callme target;
	String msg;
	
	

	Caller(callme targ,String s){
		msg=s;
		target=targ;
		t=new Thread(this);
		t.start();
	}
	
	public void run(){
		target.call(msg);
		
	}

}
