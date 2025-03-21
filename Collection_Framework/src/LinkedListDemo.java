import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int choice;
        int insVal;
        int index;
        int output;
        int srcVal;
        while (true) {
            System.out.println("1. Add at the end");// Append at the last
            System.out.println("2. Add at specified index");// Add at the specified index
            System.out.println("3. Add first");
            System.out.println("4. Add last");
            System.out.println("5. Get value from specific index");
            System.out.println("6. Replace");
            System.out.println("7. Count");
            System.out.println("8. Display");
            System.out.println("9. Get first element");
            System.out.println("10. Get last element");
            System.out.println("11. Remove first element");
            System.out.println("12. Remove element at specified index");
            System.out.println("13. Search");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        list.add(insVal);
                        break;
                    case 2:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        System.out.print("Enter index: ");
                        index = sc.nextInt();
                        list.add(index, insVal);
                        break;
                    case 3:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        list.addFirst(insVal);
                        break;
                    case 4:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        list.addLast(insVal);
                        break;
                    case 5:
                        System.out.print("Enter index value: ");
                        index = sc.nextInt();
                        System.out.println(list.get(index) + "\t");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 6:
                        System.out.print("Enter new element: ");
                        insVal = sc.nextInt();
                        System.out.print("Enter index to replace: ");
                        index = sc.nextInt();
                        list.set(index, insVal);
                        break;
                    case 7:
                        System.out.println("Count: " + list.size());
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 8:
                        for (int i = 0; i < (list.size()); System.out.print(list.get(i++) + "\t"))
                            ;

                        System.out.println();// This will help for new line.
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 9:
                        System.out.println(list.getFirst());
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 10:
                        System.out.println(list.getLast());
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 11:
                        System.out.println("Removed element: " + list.remove());
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 12:
                        System.out.print("Enter index: ");
                        index = sc.nextInt();
                        System.out.println("Removed value: " + list.remove(index));
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 13:
                        System.out.print("Enter search value: ");
                        srcVal = sc.nextInt();
                        System.out.println(list.contains(srcVal) ? "Found!" : "Not Found!");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 14:
                        System.exit(0);

                    default:
                        System.out.println("Invalid input");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Oops! Index exceed!");
            } catch (NoSuchElementException e) {// Case 6
                System.out.println("Oops! No such element exist bro!");
                System.out.println(
                        "----------------------------------------------------------------------------------------------------");
            }

        }
    }

}