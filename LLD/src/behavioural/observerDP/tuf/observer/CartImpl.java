package behavioural.observerDP.tuf.observer;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CartImpl implements CartObserver {

    String name;

    @Override
    public void update(String message) {
        System.out.println(name + " received the update: "+message);
    }

}
