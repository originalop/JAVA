import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); // Accept only integer value.
        int insVal;
        int index;
        int getValue;
        int srcVal;

        while (true) {
            System.out.println("1. Add at the end");
            System.out.println("2. Add at specific index");
            System.out.println("3. Get value from specific index");
            System.out.println("4. Replace");
            System.out.println("5. Pop from specified index");
            System.out.println("6. Count");
            System.out.println("7. Empty?");
            System.out.println("8. Search");
            System.out.println("9. Clear all");
            System.out.println("10. Display");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            System.out.println(
                    "----------------------------------------------------------------------------------------------------");
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        // Integer insVal=new Integer(insVal);
                        list.add(insVal);
                        break;
                    case 2:
                        System.out.print("Enter insert value: ");
                        insVal = sc.nextInt();
                        System.out.print("Enter index where wanna insert: ");
                        index = sc.nextInt();
                        list.add(index, insVal);
                        break;
                    case 3:
                        System.out.println("Enter index value to get value: ");
                        getValue = sc.nextInt();
                        System.out.println(list.get(getValue));
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");
                        break;
                    case 4:
                        System.out.print("Enter new value: ");
                        insVal = sc.nextInt();
                        System.out.print("Enter index: ");
                        index = sc.nextInt();
                        list.set(index, insVal);
                        break;
                    case 5:
                        System.out.print("Enter index to remove value: ");
                        index = sc.nextInt();
                        list.remove(index);
                        break;
                    case 6:
                        System.out.println("Total count: " + list.size());
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                        break;
                    case 7:
                        System.out.println((list.isEmpty()) ? "Empty" : "Not Empty");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                        break;
                    case 8:
                        System.out.print("Enter search value: ");
                        srcVal = sc.nextInt();
                        System.out.println((list.contains(srcVal)) ? "Found" : "Not Found");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                        break;
                    case 9:
                        list.clear();
                        break;
                    case 10:
                        for (int i = 0; i < (list.size()); System.out.print(list.get(i++) + "\t"))
                            ;
                        System.out.println();// Just for new line
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                        break;
                    case 11:
                        System.exit(9);
                    default:
                        System.out.println("Inavlid input");
                        System.out.println(
                                "----------------------------------------------------------------------------------------------------");

                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Oops! Entered index exceeds limit!");
            }
        }
    }
}
