package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsPlayground {
    /*
    Set is a data structure that doesn't allow duplicated items.
    The data added will NOT be ordered.
     */
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Lime");
        fruits.add("Apple"); // This element is not going to be added.

        System.out.println(fruits);
        System.out.println("Do you have limes? " + fruits.contains("Lime"));

        fruits.addAll(Arrays.asList("Avocado", "Tomato", "Banana")); // Adding a collection to the Set

        System.out.println(fruits);

    }
}
