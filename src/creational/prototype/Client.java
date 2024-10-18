package creational.prototype;

public class Client {
    public void main() {
        Square square = new Square();
        square.r = 10;
        Square new_square = square.clone();
    }
}
