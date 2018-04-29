public class Date{
	private int day;
	private int month;
	private int year;

	public Date(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}

	public void setDate(int d, int m, int y){
		day=d;
		month=m;
		year=y;
	}
	
	public Date(){
		day=0;
		month=0;
		year=0;
	}

	public String toString(){
		return day + "."+ month+ "."+ year;
	}
	public int getDay(){
		return day;
	}

	public int getMonth(){
		return month;
	}

	public int getYear(){
		return year;
	}
}