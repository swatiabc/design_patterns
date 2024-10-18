package creational.abstractFactory;

import creational.abstractFactory.factory.FactoryInterface;
import creational.abstractFactory.products.box.BoxInterface;
import creational.abstractFactory.products.button.ButtonInterface;

public class ClientBox{
    private BoxInterface boxInterface;

    public ClientBox (FactoryInterface factoryInterface) {
        boxInterface = factoryInterface.createBox();
    }

    public BoxInterface getBox() {
        return boxInterface;
    }
}
