package iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorPlayground {

    public static void main(String[] args) {
        Set<String> fruitsSet = new HashSet<>();
        fruitsSet.add("apple");
        fruitsSet.add("peach");
        fruitsSet.add("banana");
        fruitsSet.add("orange");

        Iterator<String> i = fruitsSet.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
