package factoryDP.abstractfactorydp.abstractfactoryinterface;

import factoryDP.abstractfactorydp.abstractproductinterface.Button;
import factoryDP.abstractfactorydp.abstractproductinterface.CheckBoxs;

public interface GUIFactory {
    Button createButton();
    CheckBoxs createCheckbox();
}
