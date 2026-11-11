import java.util.*;

public class Q9 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");

        ListIterator<String> it = students.listIterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Riya")) {
                it.set("Sneha");
                it.add("Priya");
            }
        }

        System.out.println("Updated List: " + students);
    }
}
