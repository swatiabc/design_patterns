package factory.creator;

import factory.product.Apple;
import factory.product.ProductInterface;

public class CreateApple implements CreationFactory{
    @Override
    public ProductInterface createProduct ( ) {
        return new Apple();
    }
}
