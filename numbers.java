import java.util.TreeMap;
public class numbers{
public static void main(String[] args){
	TreeMap<String,String> nums=new TreeMap<String ,String>();
	nums.put("raymond","56878");
	nums.put("cynthia","90768");
	nums.put("salmon","8904");
	System.out.println("the size of numbers="+nums.size());
	nums.remove("salmon");
	System.out.println("raymond's number="+nums.get("raymond"));
}
}