import java.util.*;

public class Q14 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Aman");
        list.add("Riya");
        list.add("Rahul");

        list.add(1, "Neha");
        list.remove("Riya");

        System.out.println("ArrayList: " + list);
        System.out.println("Get: " + list.get(1));
        System.out.println("Size: " + list.size());

        for (String s : list) {
            System.out.println(s);
        }

        LinkedList<String> linked = new LinkedList<>();

        linked.add("Aman");
        linked.add("Riya");
        linked.add("Rahul");

        linked.add(1, "Neha");
        linked.remove("Riya");

        System.out.println("LinkedList: " + linked);
        System.out.println("Get: " + linked.get(1));
        System.out.println("Size: " + linked.size());

        for (String s : linked) {
            System.out.println(s);
        }
    }
}
