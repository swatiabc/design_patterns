package creational.abstractFactory.factory;

import creational.abstractFactory.products.box.BoxInterface;
import creational.abstractFactory.products.box.WinBox;
import creational.abstractFactory.products.button.ButtonInterface;
import creational.abstractFactory.products.button.WinButton;

public class WinFactory implements FactoryInterface{
    @Override
    public ButtonInterface createButton ( ) {
        return new WinButton();
    }

    @Override
    public BoxInterface createBox ( ) {
        return new WinBox();
    }
}
