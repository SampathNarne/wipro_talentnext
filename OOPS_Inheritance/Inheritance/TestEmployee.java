public class TestEmployee {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee("Rahul Sharma", 750000.0, 2019, "AB123456C");

        // Test methods
        emp.displayInfo();

        System.out.println("\nUpdating salary and year...");
        emp.setAnnualSalary(820000.0);
        emp.setStartYear(2020);

        System.out.println("\nUpdated Employee Info:");
        emp.displayInfo();
    }
}
