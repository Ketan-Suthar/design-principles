package good;

public abstract class BaseEmployee implements IEmployee {
    private String firstName;

    private String lastName;

    private double salary;

    @Override
    public abstract void calculatePerHourRate(final int rank);

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getFullName() {
        return this.firstName + ' ' + this.lastName;
    }
}
