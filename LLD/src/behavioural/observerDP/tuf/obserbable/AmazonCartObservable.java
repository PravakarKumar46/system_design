package behavioural.observerDP.tuf.obserbable;

import behavioural.observerDP.tuf.observer.CartObserver;

interface AmazonCartObservable {
    void addObserver(CartObserver cart);
    void removeObserver(CartObserver cart);
    void notifyObservers(String state);
}
