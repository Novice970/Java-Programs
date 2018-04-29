
 class PC {
	 public static void main(String[] args){
		 q qq=new q();
		 new Producer(qq);
		 new Consumer(qq);
		 
		 System.out.println("Press Ctrl+C to exit");
	 }

}
