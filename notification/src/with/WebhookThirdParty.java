package with;

public class WebhookThirdParty implements INotificationProvider {
    public void send() {
        System.out.println("sending webhook. with OCP");
    }
}
