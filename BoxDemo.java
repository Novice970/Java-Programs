class Box{
	double height;
	double width;
	double length;
}

class BoxDemo{
	public static void main(String[] args){
		Box mybox=new Box();
		mybox.height=10;
		mybox.width=30;
		mybox.length=10;

		double vol= mybox.height* mybox.length * mybox.width;
		System.out.println("Volume = "+vol);		
	}
}