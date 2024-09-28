package factory;

import factory.creator.CreationFactory;
import factory.product.ProductInterface;

public class Client{
    private ProductInterface productInterface;

    public Client(CreationFactory creationFactory) {
        productInterface = creationFactory.createProduct();
    }

    public ProductInterface getProduct() {
        return productInterface;
    }
}
