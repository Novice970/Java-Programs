
public class time {
	int hour;
	int minute;
	int seconds;
	
	public void setTime(int h,int m,int s){
		hour=((h>0&&h<24)?h:0);
	minute=((m>0&&m<60)?m:0);
		seconds=((s>0&&s<60)?s:0);
	}
	
	public String toMillitary(){
		return String.format("%2d:%2d:%2d", hour,minute,seconds);
			
	}
	public static void main(String[] args){
		time myTime=new time();
		System.out.println(myTime.toMillitary());
		
	}

}
