package mypackage;

class Gen<T extends Number>{
	T[] ob;
	
	Gen(T ob[]){
		this.ob=ob;
	}
	
	double getAvg(){
		double sum=0;
		for(T a:ob){
			sum+=a.doubleValue();
			
		}
		return sum/ob.length;
	}
	
	boolean equalAvg(Gen<?> ob2){
		if(this.getAvg()== ob2.getAvg())
			return true;
		else
			return false;
	}
}

public class WildcardGenerics {
	public static void main(String[] args){
		Integer[] nums={2,3,4,5,6,7};
		Double vals[]={2.0,3.0,4.0,5.0,6.0,7.0};
		
		Gen<Integer> obj1= new Gen<Integer>(nums);
		Gen<Double> obj2=new Gen<Double>(vals);
		
		System.out.println("Avg of Obj1: "+ obj1.getAvg());
		System.out.println("Avg of Obj2: "+ obj2.getAvg());
		
		System.out.println("The both avgs are equal? : "+obj1.equalAvg(obj2));
		 
	}
}
