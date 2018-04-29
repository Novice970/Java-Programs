import java.util.*;
public class DateCalendarDemo {
	public static void main(String[] args){
		Date today= new Date();
		System.out.println(today);
		long msec= today.getTime();
		System.out.println("Milliseconds since january 1,1970= "+msec);
		
		
		Calendar calendar= Calendar.getInstance();
		
		String months[]={"Jan", "Feb", "march", "April","May", "June", "July","August", "Sept", "Oct", "Nov","Dec"};
		
		System.out.print("Date: ");
		System.out.print(months[calendar.get(Calendar.MONTH)]+" "+ calendar.get(Calendar.DATE));
		System.out.print(" "+ (calendar.get(Calendar.YEAR)));
		
	}
}
