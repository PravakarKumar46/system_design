package behavioural.observerDP.tuf.ecart;

import behavioural.observerDP.tuf.obserbable.AmazonCartImpl;
import behavioural.observerDP.tuf.observer.CartImpl;

public class EcartMain {

    public static void main(String[] args) {

        AmazonCartImpl amazonCart = new AmazonCartImpl();

        //adding observer
        CartImpl cart1 = new CartImpl("User 1");
        CartImpl cart2 = new CartImpl("User 2");
        CartImpl cart3 = new CartImpl("User 3");
        CartImpl cart4 = new CartImpl("User 4");

        //adding observers to cart
        amazonCart.addObserver(cart1);
        amazonCart.addObserver(cart2);
        amazonCart.addObserver(cart3);
        amazonCart.addObserver(cart4);

        amazonCart.changeCartState("no new item added");

        //changing state

        amazonCart.changeCartState("new item added : 1");

        amazonCart.removeObserver(cart1);

        amazonCart.changeCartState("new item added: 2");

    }
}
