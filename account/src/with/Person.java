package with;

import without.EmployeeType;

public class Person implements IPerson {
    private String firstName;

    private String lastName;

    private IAccounts accountProcessor = new Accounts();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public IAccounts getAccountProcessor() {
        return accountProcessor;
    }

    public void setAccountProcessor(IAccounts accountProcessor) {
        this.accountProcessor = accountProcessor;
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
