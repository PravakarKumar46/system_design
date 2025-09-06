package creational.factoryDP.abstractfactorydp.abstractfactoryinterface;

import creational.factoryDP.abstractfactorydp.abstractproductinterface.Button;
import creational.factoryDP.abstractfactorydp.abstractproductinterface.CheckBoxs;
import creational.factoryDP.abstractfactorydp.abstractproductinterface.WindowButton;
import creational.factoryDP.abstractfactorydp.abstractproductinterface.WindowCheckBoxs;

public class WindowFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public CheckBoxs createCheckbox() {
        return new WindowCheckBoxs();
    }
}
