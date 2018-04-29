 class Deadlock implements Runnable{
	 A a=new A();
	 B b=new B();
	 
	 Deadlock(){
		 Thread.currentThread().setName("Main THread");
		 System.out.println("Inside Main Thread");
		
		Thread t=new Thread(this,"Chained Thread");
		t.start();
		 a.foo(b);
		 
	 }
	 
	 public void run(){
		 System.out.println("Inside the chained thread");
		 b.bar(a);
	 }
	 public static void main(String[] args){
		 new Deadlock();
	 }

}
