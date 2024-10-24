package structural.composite;

public class Square extends BaseShape{

    int side;

    Square(int x, int y, int side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public int getWidth() {
        return this.side;
    }

    @Override
    public int getHeight() {
        return this.side;
    }
}
