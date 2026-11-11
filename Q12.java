import java.util.*;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<String> patients = new ArrayList<>();
        HashSet<String> ids = new HashSet<>();

        patients.add("Aman");
        patients.add("Riya");
        patients.add("Rahul");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        System.out.println("Patients: " + patients);
        System.out.println("Patient IDs: " + ids);

        patients.remove("Riya");
        ids.remove("P102");

        System.out.println("After Removal: " + patients);

        System.out.println("Search Aman: " +
                           patients.contains("Aman"));

        System.out.println("Total Patients: " + patients.size());
    }
}
