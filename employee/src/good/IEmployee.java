package good;

public interface IEmployee {
    void calculatePerHourRate(int rank);

    double getSalary();

    void setSalary(double salary);

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getFullName();
}
