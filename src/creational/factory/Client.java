package creational.factory;

import creational.factory.creator.CreationFactory;
import creational.factory.product.ProductInterface;

public class Client{
    private ProductInterface productInterface;

    public Client(CreationFactory creationFactory) {
        productInterface = creationFactory.createProduct();
    }

    public ProductInterface getProduct() {
        return productInterface;
    }
}
