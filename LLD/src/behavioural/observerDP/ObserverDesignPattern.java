package behavioural.observerDP;

import behavioural.observerDP.concreteCls.EmailNotification;
import behavioural.observerDP.concreteCls.ObservableImp;
import behavioural.observerDP.concreteCls.SMSNotification;

public class ObserverDesignPattern {
    public static void main(String[] args) {


        ObservableImp orderService = new ObservableImp();

        // Attach observers
        orderService.addObserver(new EmailNotification());

        // Place an order
        orderService.setData("email");
        orderService.getData();

        // Attach observers
        orderService.addObserver(new SMSNotification());

        // Place an order
        orderService.setData("sms");
        orderService.getData();
    }
}
