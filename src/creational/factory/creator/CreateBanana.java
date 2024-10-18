package creational.factory.creator;

import creational.factory.product.Banana;
import creational.factory.product.ProductInterface;

public class CreateBanana implements CreationFactory{
    @Override
    public ProductInterface createProduct ( ) {
        return new Banana();
    }
}
