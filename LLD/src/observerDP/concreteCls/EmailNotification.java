package observerDP.concreteCls;

import observerDP.Observers;

public class EmailNotification implements Observers {

    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }

}
