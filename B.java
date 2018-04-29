class B {
	
	synchronized void bar(A a){
		String name=Thread.currentThread().getName();
		System.out.println("I am in B's foo and trha name od my thread is"+name);
		try{
			Thread.sleep(1000);
			
		}
		catch(InterruptedException e){
			System.out.println("Interrupted inside B's bar");
		}
		
		System.out.println("Trying to call A's last()");
		a.last();
	}
	synchronized void last(){
		System.out.println("I am inside B's last()");
	}

}
