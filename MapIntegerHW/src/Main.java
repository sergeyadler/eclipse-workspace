import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(getWordCount("Ivan"));

	}
	public static String[] voc = {"Ivan", "Anna","Ivan","Ivan","Anna","Petr","lena","lena","lena","lena"};
	public static Map<String,Integer> map = new HashMap<>();
	
	public static Map<String, Integer> getWordCount(String strings)  {
		for (String s : voc ) {
			if(!map.containsKey(s)) {
				map.put(s,1);
				
			}else {
				int count = map.get(s);
				map.put(s, count+1);
			}
		}
		return map;
	}

}
