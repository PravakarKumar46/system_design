package creational.factoryDP.abstractfactorydp;

import creational.factoryDP.abstractfactorydp.abstractfactoryinterface.GUIFactory;
import creational.factoryDP.abstractfactorydp.abstractfactoryinterface.MacFactory;
import creational.factoryDP.abstractfactorydp.abstractfactoryinterface.WindowFactory;
import creational.factoryDP.abstractfactorydp.abstractproductinterface.Button;

import creational.factoryDP.abstractfactorydp.abstractproductinterface.CheckBoxs;


public class Application {
    private final Button button;
    private final CheckBoxs checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }

    public static void main(String[] args) {
        GUIFactory factory = new WindowFactory();
        Application app = new Application(factory);
        app.render();
        GUIFactory macFactory = new MacFactory();
        Application application = new Application(macFactory);
        application.render();
    }
}