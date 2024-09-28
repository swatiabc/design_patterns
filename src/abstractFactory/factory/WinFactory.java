package abstractFactory.factory;

import abstractFactory.products.box.BoxInterface;
import abstractFactory.products.box.WinBox;
import abstractFactory.products.button.ButtonInterface;
import abstractFactory.products.button.WinButton;

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
