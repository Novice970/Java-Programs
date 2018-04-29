class ExceptionDemo{
	static void demoproc(){
		try{
		throw new NullPointerException();
		}
		catch(NullPointerException g){
			System.out.println("Caught it in demoproc");
			throw new NullPointerException();
		}
	}




	public static void main(String[] args){
		try{
			demoproc();
		}
		catch(NullPointerException e){
			System.out.println("Found it in main");
			
		}
	
	}
	
}
