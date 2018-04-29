
 class A {
	 synchronized void foo(B b){
		 System.out.println("Inside A's Fooo");
		 String name=Thread.currentThread().getName();
		 System.out.println("Ths thread's name is "+name);
		 
		 try{
			 Thread.sleep(1000);
			 }
		 catch(InterruptedException e){
			 System.out.println("Interrupted");
		 }
		 System.out.println("Trying to enter now b.last()");
		 b.last();
		 
	 }
	 synchronized void last(){
		 System.out.println("I am inside A's last now");
	 }

}
