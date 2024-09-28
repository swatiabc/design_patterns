package abstractFactory;

import abstractFactory.factory.FactoryInterface;
import abstractFactory.products.box.BoxInterface;
import abstractFactory.products.button.ButtonInterface;

public class ClientBox{
    private BoxInterface boxInterface;

    public ClientBox (FactoryInterface factoryInterface) {
        boxInterface = factoryInterface.createBox();
    }

    public BoxInterface getBox() {
        return boxInterface;
    }
}
