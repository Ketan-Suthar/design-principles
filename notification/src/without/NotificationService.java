package without;


public class NotificationService {
    private final EmailThirdParty emailThirdParty = new EmailThirdParty();
    private final SMSThirdParty smsThirdParty = new SMSThirdParty();
    private final WebhookThirdParty webhookThirdParty = new WebhookThirdParty();

    public void sendNotification(final Notification notification) {
        if(notification.getNotificationType() == NotificationType.EMAIL) {
            emailThirdParty.sendEmail();
        }else if(notification.getNotificationType() == NotificationType.SMS) {
            smsThirdParty.sendSMS();
        }else if(notification.getNotificationType() == NotificationType.WEB_HOOK) {
            webhookThirdParty.sendWebhook();
        }
    }
}
