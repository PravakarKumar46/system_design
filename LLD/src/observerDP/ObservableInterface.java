package observerDP;

public interface ObservableInterface {

    void addObserver(Observers observers);

    void removeObservers(Observers observers);

    void notifyObserver();

    void setData(String data);

    void getData();

}
