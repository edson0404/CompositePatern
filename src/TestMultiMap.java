import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class TestMultiMap {

	public static void main(String[] args) {
		
		Multimap<String, String> multiMap = ArrayListMultimap.create();
		
		multiMap.put("A", "Apple");
        multiMap.put("A", "Aeroplane");
        
        multiMap.put("B", "Bat");
        multiMap.put("B", "B");
        
        multiMap.put("C", "Cat");
        multiMap.put("C", "Car");
        
        
        for (String key : multiMap.keySet()) {
            System.out.println("Key = " + key);
            System.out.println("Values = " + multiMap.get(key) + "n");
        }


	}

}
