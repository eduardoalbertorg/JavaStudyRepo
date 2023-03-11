package iterators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachPlayground {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("peach");
        fruitsList.add("banana");
        fruitsList.add("orange");

        System.out.println("Printing each fruit in the list");
        fruitsList.forEach(fruit -> System.out.println(fruit));

        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("apple", 95);
        fruitsMap.put("peach", 50);
        fruitsMap.put("banana", 105);
        fruitsMap.put("orange", 45);

        System.out.println("Printing each fruit in the map");
        fruitsMap.forEach((fruit, calorie) -> System.out.println(fruit + ": " + calorie));
    }
}
