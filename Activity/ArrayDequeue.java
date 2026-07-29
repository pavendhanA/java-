import java.util.Scanner;
import java.util.ArrayDeque;
public class ArrayDequeue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> train = new ArrayDeque<>();
        train.add("Engine");
        train.add("Coach-1");
        train.add("Coach-2");
        train.add("Coach-3"); 
        System.out.println("Initial Train: " + train);
        System.out.println("\n1. Add Coach Front");
        System.out.println("2. Add Coach Rear");
        System.out.println("3. Remove Coach Front");
        System.out.println("4. Remove Coach Rear");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter coach name: ");
                String coach = sc.nextLine();
                train.addFirst(coach);
                break;
            case 2:
                System.out.print("Enter coach name: ");
                String rearCoach = sc.nextLine();
                train.addLast(rearCoach);
                System.out.println("Coach added at Rear.");
                break;
            case 3:
                if (!train.isEmpty()) {
                    String engineCoach = train.removeFirst();
                    System.out.println("Removed: " + train.removeFirst());
                } else {
                    System.out.println("Empty");
                }
                break;
            case 4:
                if (!train.isEmpty()) {
                    System.out.println("Removed: " + train.removeLast());
                } else {
                    System.out.println("Empty");
                }
                break;
        }
        System.out.println("\nFinal Train: " + train);
    }
}