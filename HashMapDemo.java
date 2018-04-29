import java.util.*;

public class HashMapDemo {
	public static void main(String[] args){
		HashMap<String, Double> map = new HashMap<String,Double>();
		map.put("Puneet kaur", new Double (1209.89));
		map.put("Mandeep kaur", new Double (109.89));
		map.put("Asneet kaur", new Double (89.8));
		map.put("Anmol kaur", new Double (7209.49));
		
		Set<Map.Entry<String, Double>> set=map.entrySet();
		
		for(Map.Entry<String, Double> mp: set){
			System.out.println(mp.getKey()+" : "+ mp.getValue());
		}
		
		double n= map.get("Anmol kaur");
		map.put("Anmol kaur", n+1000);
		
		System.out.println("Updated balance of Anmol:");
		
		System.out.println(map.get("Anmol kaur"));

	}
}
