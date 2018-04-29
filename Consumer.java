
 class Consumer implements Runnable{
	 q q1;
	 
	 Consumer(q h){
		 q1=h;
		 new Thread(this,"consumer").start();
	 }
	 public void run(){
		 while(true){
			 q1.get();
		 }
	 }

}
