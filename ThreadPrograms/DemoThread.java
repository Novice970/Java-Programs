package ThreadPrograms;

public class DemoThread{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread().getName() + " is in state: "+Thread.currentThread().getState()+" is Alive? "+Thread.currentThread().isAlive()+"  has priority: "+Thread.currentThread().getPriority());
		
		Runnable r1= new Runnable(){
			public void run() {
				try{
				Thread.sleep(0);
				}
				catch(InterruptedException e){
					System.out.println();
				}
			}
		};
		
		Thread t1=new Thread(r1);
		System.out.println(t1.getName() + " is in state: "+t1.getState()+" is Alive? "+t1.isAlive()+"  has priority: "+t1.getPriority());
		
		t1.setName("My Thread t1");
		t1.start();
		System.out.println(t1.getName() + " is in state: "+t1.getState()+" is Alive? "+t1.isAlive()+"  has priority: "+t1.getPriority());
		
	
		Thread.sleep(2000);
		System.out.println(t1.getName() + " is in state: "+t1.getState()+" is Alive? "+t1.isAlive()+"  has priority: "+t1.getPriority());
		
		
		//Runnable r2=() -> System.out.println("This thread "+ Thread.currentThread().getName()+ "Created using Runnable interface object using lambda notation");
		
		
	}
}
