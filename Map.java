import java.util.HashMap;

public class Map {
	
	
	static HashMap<String, Boolean> map = new HashMap<>();
	public static void main (String[]args) {


map.put("Steve",true);
map.put("Bob",false);
System.out.println(map.get("Kenny"));

if(map.containsKey("Bob")) System.outprintln (1);

if (map.containsValue (Boolean.False)) System.out.println (2);

for (String s :map.keySet()) {
	
	System.out.println(3);
}

for(Boolean b : map.values()) {
	
	System.out.println(4);
}

for(Map.Entry v : map.entrySet()) {
	
}

map.remove("Steve");

}

}