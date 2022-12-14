package capitolo_17.esempi.paragrafo_17_4;
import java.util.*;

public class TestIteratorDescending {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<>();
        set.add("c");
        set.add("a");
        set.add("b");
        set.add("b");
        Iterator iter = set.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}