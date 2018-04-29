class Producer implements Runnable{
	q q1;
	
	Producer(q h){
		this.q1=h;
		new Thread(this,"Producer").start();
	}
	public void run(){
		int i=0;
		while(true){
			q1.put(i++);
		}
		
	}

}
