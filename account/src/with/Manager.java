package with;

public class Manager implements IPerson {
    private String firstName;

    private String lastName;

    private IAccounts accountProcessor = new ManagerAccount();

    public Manager(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public IAccounts getAccountProcessor() {
        return accountProcessor;
    }

    @Override
    public void setAccountProcessor(final IAccounts accountProcessor) {
        this.accountProcessor = accountProcessor;
    }
}
