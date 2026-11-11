import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        students.addFirst("Aman");
        students.addLast("Riya");
        students.addLast("Rahul");
        students.addFirst("Neha");

        System.out.println("Original Queue: " + students);

        students.removeFirst();
        students.removeLast();

        System.out.println("Updated Queue: " + students);
    }
}
