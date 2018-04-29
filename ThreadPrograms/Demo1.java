package ThreadPrograms;



public class Demo1{
	public static void main(String[] args)throws InterruptedException{
		Thread1 n=new Thread1();
		n.start();
		
		for(int i=0;i<15;i++){
			System.out.println("Main Thread");
		}
	}
}
