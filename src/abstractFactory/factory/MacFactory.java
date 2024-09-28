package abstractFactory.factory;

import abstractFactory.products.box.BoxInterface;
import abstractFactory.products.box.MacBox;
import abstractFactory.products.button.ButtonInterface;
import abstractFactory.products.button.MacButton;

public class MacFactory implements FactoryInterface{
    @Override
    public ButtonInterface createButton ( ) {
        return new MacButton();
    }

    @Override
    public BoxInterface createBox ( ) {
        return new MacBox();
    }
}
