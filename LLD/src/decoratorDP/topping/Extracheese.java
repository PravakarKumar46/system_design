package decoratorDP.topping;

import decoratorDP.BasePizza;

public class Extracheese extends ToppingDecorator{

    BasePizza basePizza;

    public Extracheese(BasePizza pizza){
        this.basePizza = pizza;
    }

    @Override
    public int cost() { return this.basePizza.cost() + 11; }

}
