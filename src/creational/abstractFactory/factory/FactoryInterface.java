package creational.abstractFactory.factory;

import creational.abstractFactory.products.box.BoxInterface;
import creational.abstractFactory.products.button.ButtonInterface;

public interface FactoryInterface{
    ButtonInterface createButton();
    BoxInterface createBox();
}
