import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        int x;
        Integer val;
        Integer remval;
        try {
            while (true) {
                System.out.println("1. Add at the end");
                System.out.println("2. Display");
                System.out.println("3. Remove");
                System.out.println("4. Search");
                System.out.println("5. Add at specific position");
                System.out.println("6. Remove all");
                System.out.println("7. Size");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter add value: ");
                        val = sc.nextInt();
                        al.add(val);
                        break;
                    case 2:
                        Iterator it = al.iterator();
                        while (it.hasNext()) {
                            System.out.print(it.next() + "\t");
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter remove value: ");
                        val = sc.nextInt();
                        System.out.println(al.remove(val));
                        break;
                    case 4:
                        System.out.print("Enter search value: ");
                        val = sc.nextInt();
                        System.out.println((al.contains(val)) ? "Found!" : "Not found!");
                        break;
                    case 5:
                        System.out.print("Enter position: ");
                        x = sc.nextInt();
                        System.out.print("Enter add value: ");
                        val = sc.nextInt();
                        al.add(x, val);
                        break;
                    case 6:
                        al.clear();
                        break;
                    case 7:
                        System.out.println("Total size is: " + al.size());
                        break;
                    case 8:
                        System.exit(0);
                        break;
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
