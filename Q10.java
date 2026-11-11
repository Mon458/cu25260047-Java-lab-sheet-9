import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        int[] values = {10, 20, 30, 20, 40, 10};

        for (int n : values) {
            list.add(n);
            set.add(n);
        }

        System.out.println("ArrayList: " + list);
        System.out.println("HashSet: " + set);
    }
}
