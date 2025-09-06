package creational.factoryDP.abstractfactorydp.abstractfactoryinterface;

import creational.factoryDP.abstractfactorydp.abstractproductinterface.Button;
import creational.factoryDP.abstractfactorydp.abstractproductinterface.CheckBoxs;

public interface GUIFactory {
    Button createButton();
    CheckBoxs createCheckbox();
}
