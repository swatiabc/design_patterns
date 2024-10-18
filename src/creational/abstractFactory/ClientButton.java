package creational.abstractFactory;

import creational.abstractFactory.factory.FactoryInterface;
import creational.abstractFactory.products.box.BoxInterface;
import creational.abstractFactory.products.button.ButtonInterface;

public class ClientButton{
    private ButtonInterface buttonInterface;

    public ClientButton (FactoryInterface factoryInterface) {
        buttonInterface = factoryInterface.createButton();
    }

    public ButtonInterface getBox() {
        return buttonInterface;
    }
}
