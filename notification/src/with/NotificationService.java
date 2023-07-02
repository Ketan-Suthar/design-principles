package with;


public class NotificationService {

    private final NotificationProviderFactory notificationProviderFactory = new NotificationProviderFactory();

    public void sendNotification(final Notification notification) {
        notificationProviderFactory.getNotificationProvider(notification.getNotificationType()).send();
    }
}
