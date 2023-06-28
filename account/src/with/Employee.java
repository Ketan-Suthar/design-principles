package with;

public class Employee {
    private String firstName;

    private String lastName;

    private String emailAddress;

    private boolean isManager = false;

    private boolean isExecutive = false;

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

    public boolean getExecutive() {
        return isExecutive;
    }

    public void setExecutive(final boolean executive) {
        this.isExecutive = executive;
    }

    public boolean getManager() {
        return isManager;
    }

    public void setManager(final boolean manager) {
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
