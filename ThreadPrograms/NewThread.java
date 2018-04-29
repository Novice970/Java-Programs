package ThreadPrograms;

public class NewThread implements Runnable{
	Thread t;
	String name;
	
	NewThread(String nname){
		t=new Thread(this,nname);
		name = nname;
		System.out.println(t);
		t.start();
		
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println(name+ " "+ i);
				Thread.sleep(1000);
				
			}
		}
			catch(InterruptedException e){
				System.out.println(name + " intrrupted");
				
			}
		System.out.println("THread exiting "+ name);
			
		}
	}


