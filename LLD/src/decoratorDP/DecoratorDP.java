package decoratorDP;

import decoratorDP.category.MargheritaPizza;
import decoratorDP.topping.Extracheese;
import decoratorDP.topping.Mushroom;

public class DecoratorDP {

    public static void main(String[] args) {

        BasePizza pizza = new Mushroom(new Extracheese(new MargheritaPizza()));
        System.out.println("Pizza cost: " + pizza.cost());

    }
}
