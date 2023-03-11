package collections;

import java.util.ArrayList;
import java.util.List;

public class ListsPlayground {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("peach");
        fruits.add("banana");
        fruits.add("orange");
        fruits.set(2, "grape");
        fruits.add("peach");

        System.out.println("Display list content: " + fruits);
        System.out.println("Get by Index: " + fruits.get(2));
        System.out.println("Peach's index: " + fruits.indexOf("peach"));
        System.out.println("Last index where peach is shown: " + fruits.lastIndexOf("peach"));
        System.out.println("Looking for non existing element banana: " + fruits.indexOf("banana"));
    }
}
