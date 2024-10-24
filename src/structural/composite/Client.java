package structural.composite;

public class Client {
    public void main() {
        CompositeShape compositeShape1 = new CompositeShape();
        Shape shape = new Circle(1,2,3);
        compositeShape1.add(shape);
        CompositeShape compositeShape2 = new CompositeShape();
        compositeShape1.add(compositeShape2);
        Shape shape1 = new Square(1, 2, 3);
        compositeShape2.add(shape1);

        compositeShape1.move(1, 2);
    }
}
