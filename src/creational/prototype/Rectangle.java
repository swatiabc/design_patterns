package creational.prototype;

public class Rectangle extends Prototype{
    int l;
    int w;

    public Rectangle() {

    }
    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.l = rectangle.l;
        this.w = rectangle.w;
    }
    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }
}
