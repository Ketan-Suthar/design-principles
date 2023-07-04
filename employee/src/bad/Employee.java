package bad;

public class Employee {
    private String firstName;

    private String lastName;

    private double salary;

    private Employee manager;

    public void calculatePerHourRate(final int rank) {
        double baseAmount = 12.50;
        this.salary = baseAmount + (rank * 2);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee getManager() {
        return manager;
    }

    public void assignManager(Employee manager) throws Exception {
        // other stuff
        this.manager = manager;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
