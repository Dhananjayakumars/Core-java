package maps;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MonthTree {

	public static void main(String[] args) {
		TreeMap<String, Integer> month = new TreeMap<String, Integer>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		month.put("May", 31);
		month.put("June", 30);
		month.put("July", 31);
		month.put("August", 31);
		month.put("September", 30);
		month.put("October", 31);
		month.put("November", 30);
		month.put("December", 31);
		System.out.println(month);
		System.out.println("========================================");
		
		month.forEach((k,v)->System.out.println("key "+k+ " and value "+v));
		
		System.out.println("========================================");
		
		Set<Entry<String, Integer>>entry=month.entrySet();
		for(Entry<String, Integer>value:entry) {
			System.out.println("key "+value.getKey()+" and value "+value.getValue());
		}
		

	}

}
