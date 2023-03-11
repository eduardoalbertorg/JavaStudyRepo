package collections;

import java.util.HashMap;

public class MapPlayground {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("apple", 95);
        fruitsMap.put("peach", 50);
        fruitsMap.put("banana", 105);
        fruitsMap.put("orange", 45);
        fruitsMap.put("peach", 17);

        System.out.println("Displaying the map's contents " + fruitsMap);
        System.out.println("Get value for banana: " + fruitsMap.get("banana"));
    }
}
