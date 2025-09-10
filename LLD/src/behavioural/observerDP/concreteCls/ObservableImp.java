package behavioural.observerDP.concreteCls;

import behavioural.observerDP.ObservableInterface;
import behavioural.observerDP.Observers;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp implements ObservableInterface {

    private final List<Observers> observers = new ArrayList<>();

    String data;

    @Override
    public void addObserver(Observers observer) {
        observers.add(observer);
    }

    @Override
    public void removeObservers(Observers observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println("Order Placed Successfully.");
        for (Observers observer : observers) {
            observer.update("New Order Placed");
        }
    }

    @Override
    public void setData(String data) {
        this.data = data;
        System.out.println("setting the data...");
        notifyObserver();
    }

    @Override
    public void getData() {
        System.out.println("Data : "+ data);
    }
}
