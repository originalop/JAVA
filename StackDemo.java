import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        Iterator i = s.iterator();
        Scanner sc = new Scanner(System.in);
        Integer val;
        try {
            while (true) {
                System.out.println("1. Push"); // Add new object
                System.out.println("2. Pop"); // Remove first object from stack
                System.out.println("3. peek"); // Get first object without removing it
                System.out.println("4. Empty?");// Check stack is empty or not. If stack is empty then it returns true
                                                // otherwise false.

                System.out.println("5. Search"); // Search object
                System.out.println("6. Display");
                System.out.println("7. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter push element: ");
                        val = sc.nextInt();
                        s.push(val);
                        break;
                    case 2:
                        val = s.pop();
                        System.out.println("Popped value: " + val);
                        break;
                    case 3:
                        val = s.peek();
                        System.out.println("Peeked value: " + val);
                        break;
                    case 4:
                        System.out.println((s.empty()) ? "Empty" : "Not empty");
                        break;
                    case 5:
                        System.out.print("Enter search value: ");
                        val = sc.nextInt();
                        int position = s.search(val);
                        System.out.println("Position: " + position);
                        break;
                    case 6:
                        for (Integer ww : s) {
                            System.out.println(ww);
                        }
                        break;
                    case 7:
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        // System.out.println(s.;
        for (Integer it : s) {
            System.out.println(it);
        }

    }

}
