package without;

public class Employee {
    private String firstName;

    private String lastName;

    private String emailAddress;

    private Boolean isManager = false;

    private Boolean isExecutive = false;

    public Employee() {
    }

    @Override
    public String toString() {
        return firstName + ' ' + lastName + ' ' + emailAddress +
                ' ' + "isManager: " + isManager +
                ' ' + "isExecutive: " + isExecutive;
    }

    public Employee(String firstName, String lastName, String emailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public Boolean getExecutive() {
        return isExecutive;
    }

    public void setExecutive(Boolean executive) {
        isExecutive = executive;
    }

    public Boolean getManager() {
        return isManager;
    }

    public void setManager(Boolean manager) {
        isManager = manager;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
