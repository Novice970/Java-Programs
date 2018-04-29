
public class execdemo {
	public static void main(String[] args){
		Runtime r=Runtime.getRuntime();
		double mem1,mem2;
		Integer somenums[]=new Integer[1000];
		mem1=r.freeMemory();
		System.out.println("The free memory initially is"+mem1); 
		r.gc();
		mem1=r.freeMemory();
		System.out.println("The free memory after garbage collection is"+mem1);
		for(int i=0;i<1000;i++){
			somenums[i]=new Integer(i);
			
		}
		mem2=r.freeMemory();
		System.out.println("the free memory after allocation is"+mem2);
		r.gc();
		mem2=r.freeMemory();
		System.out.println("the free memory after the garbage collection is"+mem2);
		System.out.println("the alocted memory is"+(mem1-mem2));
		
		
		
	
		
	}
}
