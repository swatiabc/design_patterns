package abstractFactory;

import abstractFactory.factory.FactoryInterface;
import abstractFactory.products.box.BoxInterface;
import abstractFactory.products.button.ButtonInterface;

public class ClientButton{
    private ButtonInterface buttonInterface;

    public ClientButton (FactoryInterface factoryInterface) {
        buttonInterface = factoryInterface.createButton();
    }

    public ButtonInterface getBox() {
        return buttonInterface;
    }
}
