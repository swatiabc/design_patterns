package creational.abstractFactory.factory;

import creational.abstractFactory.products.box.BoxInterface;
import creational.abstractFactory.products.box.MacBox;
import creational.abstractFactory.products.button.ButtonInterface;
import creational.abstractFactory.products.button.MacButton;

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
