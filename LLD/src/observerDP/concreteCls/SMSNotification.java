package observerDP.concreteCls;

import observerDP.Observers;

public class SMSNotification implements Observers {

    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
