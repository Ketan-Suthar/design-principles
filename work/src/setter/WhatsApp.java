package setter;

public class WhatsApp implements IMessageSender {
    public void send(final String receiver, final String message) {
        System.out.printf("sending WhatsApp message to: %s, message: %s\n", receiver, message);
    }
}
