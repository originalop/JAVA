import java.util.*;

public class LinkedListClassDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        int choice;
        Integer val;
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("1. Add");
                System.out.println("2. Display");
                System.out.println("3. Add first");
                System.out.println("4. Add last");
                System.out.println("5. Remove first");
                System.out.println("6. Remove last");
                System.out.println("7. Clear");
                System.out.println("8. Size");
                System.out.println("9. Exit");
                System.out.println("10. Remove specific data");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter add value: ");
                        val = sc.nextInt();
                        ll.add(val);
                        break;
                    case 2:
                        for (Integer temp : ll) {
                            System.out.print(temp + "\t");
                        }
                        System.out.println();
                        break;
                    case 3:
                        System.out.print("Enter ad value: ");
                        val = sc.nextInt();
                        ll.addFirst(val);
                        break;
                    case 4:
                        System.out.print("Enter add value: ");
                        val = sc.nextInt();
                        ll.addLast(val);
                        break;
                    case 5:
                        System.out.println("Removed value: " + ll.removeFirst());
                        break;
                    case 6:
                        System.out.println("Removed value: " + ll.removeLast());
                        break;
                    case 7:
                        ll.clear();
                        break;
                    case 8:
                        System.out.println("Size: " + ll.size());
                        break;
                    case 9:
                        System.exit(0);
                        break;
                    case 10:
                        System.out.print("Enter remove value: ");
                        val = sc.nextInt();
                        System.out.println("Removed value: " + (ll.remove(val)));
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}