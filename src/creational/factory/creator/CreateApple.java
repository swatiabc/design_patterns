package creational.factory.creator;

import creational.factory.product.Apple;
import creational.factory.product.ProductInterface;

public class CreateApple implements CreationFactory{
    @Override
    public ProductInterface createProduct ( ) {
        return new Apple();
    }
}
