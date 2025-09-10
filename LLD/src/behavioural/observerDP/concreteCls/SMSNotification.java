package behavioural.observerDP.concreteCls;

import behavioural.observerDP.Observers;

public class SMSNotification implements Observers {

    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}
