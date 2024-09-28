package abstractFactory.products.box;

public class WinBox implements BoxInterface{
    @Override
    public void print ( ) {
        System.out.println("This is win box");
    }
}
