public class DateTest{

	public static void main(String[] args){
		Date today= new Date(10,3,1994);
		System.out.println("Todays date is : "+ today.getDay() +"."+ today.getMonth() + "."+ today.getYear());
		Date someday= new Date();
		System.out.println("Somedays date is : "+ someday.getDay() +"."+ someday.getMonth() + "."+ someday.getYear());
		someday.setDate(12,5,1998);
		System.out.println("Somedays date is :"+ someday.toString());
	}
}