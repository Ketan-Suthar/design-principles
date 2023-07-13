package bad;

public class EMailer {
    public void sendEmail(final String receiver, final String message) {
        System.out.printf("sending email to: %s, message: %s\n", receiver, message);
    }
}
