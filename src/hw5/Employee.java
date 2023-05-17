package hw5;

public class Employee {
    private final String fullName;
    private final String position;
    private final String email;
    private final String phone;
    private final int age;

    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("John Wick", "programmer", "john.wick@gmail.com", "+380 73 611 1485", 28);
        employee.showEmployeeInfo();
    }

    public void showEmployeeInfo() {
        System.out.println("--- The first employee ---");
        System.out.println("Full name: " + this.fullName);
        System.out.println("Position: " + this.position);
        System.out.println("Email: " + this.email);
        System.out.println("Phone: " + this.phone);
        System.out.println("Age: " + this.age);
    }
}
