package structural.decoratorDP;

import structural.decoratorDP.category.MargheritaPizza;
import structural.decoratorDP.topping.Extracheese;
import structural.decoratorDP.topping.Mushroom;

public class DecoratorDP {

    public static void main(String[] args) {

        BasePizza pizza = new Mushroom(new Extracheese(new MargheritaPizza()));
        System.out.println("Pizza cost: " + pizza.cost());

    }
}
