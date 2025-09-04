package factoryDP.abstractfactorydp.abstractfactoryinterface;

import factoryDP.abstractfactorydp.abstractproductinterface.Button;
import factoryDP.abstractfactorydp.abstractproductinterface.CheckBoxs;
import factoryDP.abstractfactorydp.abstractproductinterface.WindowButton;
import factoryDP.abstractfactorydp.abstractproductinterface.WindowCheckBoxs;

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
