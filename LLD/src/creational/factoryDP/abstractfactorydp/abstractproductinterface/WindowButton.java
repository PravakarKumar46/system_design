package creational.factoryDP.abstractfactorydp.abstractproductinterface;

public class WindowButton implements Button {
    @Override
    public void render() {
        System.out.println("window Button");
    }
}
