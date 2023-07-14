package setter;

public class EMailer implements IMessageSender {
    public void send(final String receiver, final String message) {
        System.out.printf("sending email to: %s, message: %s\n", receiver, message);
    }
}
