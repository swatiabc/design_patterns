package factory.creator;

import factory.product.Banana;
import factory.product.ProductInterface;

public class CreateBanana implements CreationFactory{
    @Override
    public ProductInterface createProduct ( ) {
        return new Banana();
    }
}
