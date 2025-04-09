import java.util.*;

public class LinkedHashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("India");
        lhs.add("US");
        lhs.add("UK");

        for (String i : lhs) {
            System.out.println(i);
        }

        Iterator i = lhs.iterator();
        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }

    }

}
