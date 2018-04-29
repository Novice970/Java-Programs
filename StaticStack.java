
public class StaticStack implements stackinterface {
	
	public int tos;
	public static int item[];
	
	public StaticStack(int size){
		item= new int[size];
		tos=-1;
	}
	
	public int pop(){
		if(tos<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			
			return item[tos--];
			
		}
	}
	public void push(int number){
		if(tos<item.length-1){
			item[++tos]=number;
			
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	
	public static void main(String[] args){
		StaticStack ss=new StaticStack(10);
		
		for(int i=0;i<10;i++)ss.push(i);
		
		System.out.println("here are the stack items");
		
		for(int p=0;p<10;p++)System.out.println(item[p]);
		System.out.println("GoodBye");
		
	}

}
