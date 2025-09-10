package behavioural.observerDP.tuf.obserbable;

import behavioural.observerDP.tuf.observer.CartObserver;

import java.util.ArrayList;
import java.util.List;

public class AmazonCartImpl implements AmazonCartObservable {

    List<CartObserver> cartList = new ArrayList<>();

    @Override
    public void addObserver(CartObserver cart) {
        cartList.add(cart);
    }

    @Override
    public void removeObserver(CartObserver cart) {
        cartList.remove(cart);
    }

    @Override
    public void notifyObservers(String message) {
        for (CartObserver cart : cartList) {
            cart.update(message);
        }
    }

    /**
     * method to change the state of the cart
     */

    public void changeCartState(String newState) {
        System.out.println("Cart state changed to " + newState);
        notifyObservers(newState);
    }

}
