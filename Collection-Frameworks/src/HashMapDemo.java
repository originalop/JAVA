import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Long> hm = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        String key;
        Long mob;
        try {
            while (true) {
                System.out.println("1. Add");
                System.out.println("2. Display");
                System.out.println("3. Remove");
                System.out.println("4. Clear");
                System.out.println("5. Size");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter key: ");
                        key = sc.nextLine();
                        System.out.print("Enter value: ");
                        mob = sc.nextLong();
                        hm.put(key, mob);
                        break;
                    case 2:
                        System.out.print("Enter key to search: ");
                        key = sc.nextLine();
                        System.out.println(hm.get(key));
                        break;
                    case 3:
                        System.out.print("Enter key to delete: ");
                        key = sc.nextLine();
                        System.out.println(hm.remove(key)
                                + " Removed");
                        break;
                    case 4:
                        hm.clear();
                        break;
                    case 5:
                        System.out.println("Size: " + hm.size());
                        break;
                    case 6:
                        sc.close();
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}