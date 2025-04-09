import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("India");
        hs.add("US");
        hs.add("UK");
        hs.add("Canada");
        // System.out.println(hs);
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            // System.out.println((String).it.hasNext());
            String s = (String) it.next();
            System.out.println(s);
        }
    }
}