package decoratorDP.topping;

import decoratorDP.BasePizza;

public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() { return this.basePizza.cost() + 16; }

}
