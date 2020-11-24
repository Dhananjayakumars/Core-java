package maps;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class TraineeHashmap {

	public static void main(String[] args) {
		
		HashMap<String, Integer>trainee=new HashMap<String, Integer>();
		trainee.put("dhananjaya", 2568);
		trainee.put("krishna", 2266);
		trainee.put("subhash", 1892);
		trainee.put("sunidhi", 1225);
		trainee.put("sindu", 2315);
		trainee.put("vedha", 7523);
		
		System.out.println(trainee);
		System.out.println("==================================");
		
		
		trainee.forEach((k,v)->System.out.println("key "+k+" and value "+v));
		System.out.println("====================================");

		Set<Entry<String, Integer>>entry=trainee.entrySet();
		for(Entry<String, Integer>value:entry) {
			System.out.println("key "+value.getKey()+" and value "+value.getValue());
		}
				
		
		
		
		
	}

}
