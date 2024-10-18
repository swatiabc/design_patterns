package creational.prototype;

public class Square  extends Prototype{
    int r;

    public Square() {

    }
    public Square(Square square) {
        super(square);
        this.r = square.r;
    }
    @Override
    public Square clone() {
        return new Square(this);
    }
}
