package creational.factoryDP.abstractfactorydp.abstractfactoryinterface;

import creational.factoryDP.abstractfactorydp.abstractproductinterface.*;

public class MacFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBoxs createCheckbox() {
        return new MacCheckBoxs();
    }
}
