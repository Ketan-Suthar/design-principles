package with;

import java.util.HashMap;
import java.util.Map;

public class NotificationProviderFactory {
    Map<NotificationType, INotificationProvider> notificationProviderMap;

    public NotificationProviderFactory() {
        notificationProviderMap = new HashMap<>();
        notificationProviderMap.put(NotificationType.EMAIL, new EmailThirdParty());
        notificationProviderMap.put(NotificationType.SMS, new SMSThirdParty());
        notificationProviderMap.put(NotificationType.WEB_HOOK, new WebhookThirdParty());
    }

    public INotificationProvider getNotificationProvider(final NotificationType notificationType) {
        return notificationProviderMap.get(notificationType);
    }


}
