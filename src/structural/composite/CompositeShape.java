package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends BaseShape {
    protected ArrayList<Shape> components = new ArrayList<>();

    CompositeShape(Shape... components) {
        super(0,0);
        addAll(components);
    }

    public  void addAll(Shape... shape) {
        components.addAll(List.of(shape));
    }

    public  void removeAll(Shape... shape) {
        components.removeAll(List.of(shape));
    }

    public void add(Shape shape) {
        components.add(shape);
    }

    public void remove(Shape shape) {
        components.remove(shape);
    }

    @Override
    public void move(int x, int y) {
        for(Shape shape : components) {
            shape.move(x, y);
        }
    }
}
