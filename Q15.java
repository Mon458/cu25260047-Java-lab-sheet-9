import java.util.*;

public class Q15 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        HashSet<Integer> uniqueIDs = new HashSet<>();
        TreeSet<Integer> sortedIDs = new TreeSet<>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward and Backward");
            System.out.println("7. Display Sorted IDs");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();

                    if (uniqueIDs.add(id)) {
                        students.add(name);
                        sortedIDs.add(id);
                        System.out.println("Student Added Successfully!");
                    } else {
                        System.out.println("Student ID Already Exists!");
                    }
                    break;

                case 2:
                    System.out.print("Enter ID to Remove: ");
                    int removeID = sc.nextInt();

                    if (uniqueIDs.remove(removeID)) {
                        sortedIDs.remove(removeID);
                        System.out.println("ID Removed Successfully!");
                        System.out.println("Note: Corresponding name is not linked to the ID in this simple program.");
                    } else {
                        System.out.println("ID Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to Search: ");
                    int searchID = sc.nextInt();

                    if (uniqueIDs.contains(searchID)) {
                        System.out.println("Student Found!");
                    } else {
                        System.out.println("Student Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Students: " + students);
                    System.out.println("Unique IDs: " + uniqueIDs);
                    break;

                case 5:
                    System.out.println("Total Students: " + students.size());
                    System.out.println("Total Unique IDs: " + uniqueIDs.size());
                    break;

                case 6:
                    ListIterator<String> it = students.listIterator();

                    System.out.println("Forward:");

                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }

                    System.out.println("Backward:");

                    while (it.hasPrevious()) {
                        System.out.println(it.previous());
                    }
                    break;

                case 7:
                    System.out.println("Sorted IDs: " + sortedIDs);
                    break;

                case 8:
                    System.out.println("Exiting Program...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 8);

        sc.close();
    }
}
