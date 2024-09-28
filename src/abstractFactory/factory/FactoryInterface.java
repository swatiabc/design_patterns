package abstractFactory.factory;

import abstractFactory.products.box.BoxInterface;
import abstractFactory.products.button.ButtonInterface;

public interface FactoryInterface{
    ButtonInterface createButton();
    BoxInterface createBox();
}
