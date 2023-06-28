package with;

public interface IPerson {
    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    IAccounts getAccountProcessor();

    void setAccountProcessor(IAccounts accountProcessor);
}
