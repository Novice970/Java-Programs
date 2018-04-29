
public class channi {
	public static void main(String[] args){
		Thread t =Thread.currentThread();
		System.out.println("The current name "+t.getName());
		t.setName("munna");
		System.out.println("The changed name "+t.getName());
		System.out.println("The current priorty "+t.getPriority());
		t.setPriority(10);
		System.out.println("The changed priorty "+t.getPriority());
		System.out.println(t.toString());
		try{
			for(int i=5;i>0;i--){
				System.out.println(i);
				t.sleep(1000);
				
			}
		}
			catch(InterruptedException e){
				System.out.println("Main Thread interrupted");
			}
		}
	}

