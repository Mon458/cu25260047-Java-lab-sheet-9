import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(75);
        marks.add(90);
        marks.add(85);
        marks.add(70);

        System.out.println("First Mark: " + marks.get(0));
        System.out.println("Middle Mark: " + marks.get(2));
        System.out.println("Last Mark: " + marks.get(4));
    }
}
