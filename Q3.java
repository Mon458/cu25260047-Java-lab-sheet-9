import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Neha");
        students.add("Priya");

        students.set(1, "Sneha");
        students.remove(3);

        System.out.println("Updated List: " + students);
    }
}
