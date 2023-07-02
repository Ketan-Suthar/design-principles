package without;

public class Driver {
    public static void main(String[] args) {
        final var notification = new Notification();
        final var notificationService = new NotificationService();

        notification.setNotificationType(NotificationType.EMAIL);
        notificationService.sendNotification(notification);

        notification.setNotificationType(NotificationType.SMS);
        notificationService.sendNotification(notification);

        notification.setNotificationType(NotificationType.WEB_HOOK);
        notificationService.sendNotification(notification);
    }
}
