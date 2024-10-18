package creational.abstractFactory.products.button;

public class WinButton implements ButtonInterface{

    @Override
    public void print ( ) {
        System.out.println("This is Win button");
    }
}
