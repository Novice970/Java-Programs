
public class DynamicStack  implements stackinterface{
	
	public static int item[];
	public int tos;
	
	DynamicStack(int size){
		item=new int[size];
		tos=-1;
		
	}
	
	public void push(int number){
		if(tos==item.length-1){
			int temp[]=new int[item.length*2];
			for(int i=0;i<item.length-1;i++)temp[i]=item[i];
			item=temp;
			item[++tos]=number;
			
		}
		else{
			item[++tos]=number;
			
		}
	}
	public int pop(){
		if(tos<0){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
		return(item[tos--]);
		}
	}
	
	public static void main(String[] args){
		DynamicStack ds=new DynamicStack(5);
		
		for(int j=0;j<8;j++)ds.push(j);
		
		//ds.push(7);
		//ds.push(10);
		
		for(int k=0;k<8;k++)System.out.println(ds.pop());
		
		System.out.println("GoodBye..");
	}
}
