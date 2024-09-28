package abstractFactory.products.box;

public class MacBox implements BoxInterface{
    @Override
    public void print ( ) {
        System.out.println("This is max box");
    }
}
