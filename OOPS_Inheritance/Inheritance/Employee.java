public class Employee extends Person {
    private double annualSalary;
    private int startYear;
    private String nationalInsuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int startYear, String nationalInsuranceNumber) {
        super(name); // calling Person constructor
        this.annualSalary = annualSalary;
        this.startYear = startYear;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getStartYear() {
        return startYear;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Display employee details
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Annual Salary: ₹" + annualSalary);
        System.out.println("Start Year: " + startYear);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }
}
