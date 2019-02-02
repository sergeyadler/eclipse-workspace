
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		List<String> duplicates = Arrays.asList("Ivan", "Petr", "Ivan", "Petr", "Anna");
		System.out.println(removeDuplicates(duplicates));
		
		Map<String, String>map= new HashMap<>();
		map.put("a", "Hi");
		map.put("b", "There");
		System.out.println(mapAB(map));

		String [] strings = {"Ivan","LEna","LEna","coon","Ivan"};
		System.out.println(wordMultiplite(strings));

	}
		
				
				public static List<String> removeDuplicates(List<String> list) {
		// Set<String> set = new HashSet<>(list); ----- and than return new
		// ArrayList<>(set)
		Set<String> set = new HashSet<>();
		set.addAll(list);

		return new ArrayList<>(set);
		}
	
		public static List <String>  getDuplicate(List <String>input) { 
			Set<String> set = new HashSet<String>() ;
		    List<String> ret = new ArrayList<String>(); 
		    for(String s : input){
		    	if(!set.add(s)){
		    		ret.add(s);
		    	}
		    	
		    }
		    return ret;
		}
		
		
		public static Map<String, String> mapAB(Map<String, String> map) {
			if(map.containsKey("a")&& map.containsKey("b")){
				map.put("ab",map.get("a")+map.get("b"));
			}
			
			
	
		return map;
		}
		public static Map<String,Boolean> wordMultiplite(String[] strings){
		Map map = new HashMap();
		for(String s : strings){
		    map.put(s, !map.containsKey(s));
//			if(!map.containsKey(s)){
//				 map.put(s, false);
//			}
//			else{
//				map.put(s, true);
//			}
		}
		return map;
		}
		 
	}
