package maps;


import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;



public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkmap=new LinkedHashMap<Integer, String>();
		linkmap.put(1253222365, "Dhananjaya");
		linkmap.put(1255232562, "likith");
		linkmap.put(1261165685, "harshith");
		linkmap.put(1526511522, "chandan");
		linkmap.put(1852325230, "sneha");
		
		//traversing 1
		System.out.println(linkmap);
		
		linkmap.put(1256326565, "hemagiri");
		linkmap.put(1226532336, "padma");
		//traversing 2
		
		linkmap.forEach((k,v)->System.out.println("key "+k +" and value "+v));
		
		System.out.println("====================================");
		Set<Integer>keyset=linkmap.keySet();
		for(Integer keyi:keyset) {
			System.out.println("key :"+keyi + " value :"+linkmap.get(keyi));
		}
		System.out.println("=========================================");
	Set<Entry<Integer, String>> entry=linkmap.entrySet();
	for(Entry<Integer, String>ivalue:entry)
	System.out.println("key "+ ivalue.getKey() +"value "+ivalue.getValue());

	}

}
