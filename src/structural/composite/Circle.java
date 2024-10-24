package structural.composite;

public class Circle extends BaseShape{
    int radios;
    Circle(int x, int y, int radios) {
        super(x, y);
        this.radios = radios;
    }

    @Override
    public int getWidth() {
        return radios*2;
    }

    @Override
    public int getHeight() {
        return radios*2;
    }

}
