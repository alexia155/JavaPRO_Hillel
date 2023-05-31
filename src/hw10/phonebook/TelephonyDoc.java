package hw10.phonebook;
import java.util.*;

public class TelephonyDoc {
    private List<Record> records;
    public TelephonyDoc() {
        records = new ArrayList<>();
    }

    public void add(Record record) {
        records.add(record);
    }

    public String find(String findFirstName, String findLastName) {
        List<Record> allRecords = getRecords();
        for (Record record : allRecords) {
            if (Objects.equals(findFirstName, record.getFirstName()) && Objects.equals(findLastName, record.getLastName())) {
                return "Name: " + record.getFirstName() + " " + record.getLastName() + ",     Phone: " + record.getPhoneNumber();
            }
        }
        return null;
    }

    public List<Record> getRecords() {
        return records;
    }
}
