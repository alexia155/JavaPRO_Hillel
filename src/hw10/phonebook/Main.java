package hw10.phonebook;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TelephonyDoc telephonyDoc = new TelephonyDoc();

        Record record1 = new Record("John", "Alison", "+380 736 94 89");
        telephonyDoc.add(record1);

        Record record2 = new Record("Lara", "Adamson", "+380 511 62 74");
        telephonyDoc.add(record2);

        Record record3 = new Record("Lara", "Adamson", "+380 571 63 77");
        telephonyDoc.add(record3);

        Record record4 = new Record("Kira", "Roberts", "+380 220 15 56");
        telephonyDoc.add(record4);

        List<Record> allRecords = telephonyDoc.getRecords();
        for (Record record : allRecords) {
            System.out.println("Name: " + record.getFirstName() + " " + record.getLastName() +
                               ",     Phone: " + record.getPhoneNumber());
        }

        System.out.println("--------------------------------------------------------------------------------");
        String findFirstName = "Lara";
        String findLastName = "Adamson";
        System.out.println("First method to find a record by the name (returns only the first result): " + '\n' + telephonyDoc.find(findFirstName, findLastName));

        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Second method to find a record by the name (returns all results): " + '\n');

    }
}
