package factoryDP.abstractfactorydp.abstractfactoryinterface;

import factoryDP.abstractfactorydp.abstractproductinterface.*;

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
