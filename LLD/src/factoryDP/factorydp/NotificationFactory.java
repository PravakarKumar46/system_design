package factoryDP.factorydp;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        if (type == null || type.isEmpty())
            return null;
        if ("SMS".equalsIgnoreCase(type))
            return new SMSNotification();
        else if ("EMAIL".equalsIgnoreCase(type))
            return new EmailNotification();
        else if ("PUSH".equalsIgnoreCase(type))
            return new PushNotification();
        return null;
    }

}
