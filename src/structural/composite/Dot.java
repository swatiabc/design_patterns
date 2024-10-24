package structural.composite;

public class Dot extends BaseShape{
    Dot(int x, int y) {
        super(x, y);
    }

    @Override
    public int getWidth() {
        return 3;
    }

    @Override
    public int getHeight() {
        return 3;
    }
}
