import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        int choice;
        int x;
        Integer val;
        try {
            while (true) {
                System.out.println("1. Add");// Add object ad the end
                System.out.println("2. Add at specific position");// This method take two arguements, 1st position where
                                                                  // you
                                                                  // want to add object and 2nd the object which will
                                                                  // store
                System.out.println("3. Remove by position");// This method remove object from specified position
                System.out.println("4. Display");
                System.out.println("5. Clear");
                System.out.println("6. Contains");
                System.out.println("7. Size");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter insert object: ");
                        val = sc.nextInt();
                        v.add(val);
                        break;
                    case 2:
                        System.out.print("Enter insert object: ");
                        val = sc.nextInt();
                        System.out.print("Enter position: ");
                        x = sc.nextInt();
                        v.add(x, val);
                        break;
                    case 3:
                        System.out.print("Enter remove position: ");
                        x = sc.nextInt();
                        val = v.remove(x);
                        System.out.println(val + " Removed");
                        break;
                    case 4:
                        Iterator<Integer> it = v.iterator();
                        while (it.hasNext()) {
                            System.out.print(it.next() + "\t");
                        }
                        System.out.println();
                        break;
                    case 5:
                        v.clear();
                        break;
                    case 6:
                        System.out.print("Enter search object: ");
                        val = sc.nextInt();
                        System.out.println((v.contains(val)) ? "Found!" : "Not Found!");
                        break;
                    case 7:
                        System.out.println("Size: " + v.size());
                        break;
                    case 8:
                        sc.close();
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
