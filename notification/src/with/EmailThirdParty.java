package with;

public class EmailThirdParty implements INotificationProvider {
    public void send() {
        System.out.println("sending email. with OCP");
    }
}
