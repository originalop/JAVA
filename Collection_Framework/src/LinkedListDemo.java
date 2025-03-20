import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int choice;
        int insVal;
        int index;
        int output;
        while (true) {
            System.out.println("1. Add at the end");// Append at the last
            System.out.println("2. Add at specified index");// Add at the specified index
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter insert value: ");
                    insVal = sc.nextInt();
                    list.add(insVal);
                    break;
                case 2:
                    System.out.println("Enter insert value: ");
                    insVal = sc.nextInt();
                    System.out.println("Enter index: ");
                    index = sc.nextInt();
                    list.add(index, insVal);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }

        }
    }

}
