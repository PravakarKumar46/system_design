package factoryDP;

import factoryDP.factorydp.Notification;
import factoryDP.factorydp.NotificationFactory;

public class FactoryDP {
    public static void main(String[] args) {
//        NotificationFactory factory = new NotificationFactory();
//        Notification emailNotification = factory.createNotification("EMAIL");
//        Notification smsNotification = factory.createNotification("SMS");
//        Notification pushNotification = factory.createNotification("PUSH");
//        emailNotification.notifyUser();  // Output: Sending Email Notification
//        smsNotification.notifyUser();  // Output: Sending SMS Notification
//        pushNotification.notifyUser();  // Output: Sending Push Notification

        Notification emailNotification = NotificationFactory.createNotification("EMAIL");
        Notification smsNotification = NotificationFactory.createNotification("SMS");
        Notification pushNotification = NotificationFactory.createNotification("PUSH");
        emailNotification.notifyUser();  // Output: Sending Email Notification
        smsNotification.notifyUser();  // Output: Sending SMS Notification
        pushNotification.notifyUser();  // Output: Sending Push Notification
    }
}
