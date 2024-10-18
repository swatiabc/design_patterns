package creational.prototype;

abstract class Prototype {
    int x;
    int y;
    char colour;

    public Prototype() {
    }

    public Prototype(Prototype prototype) {
        this();
        this.x = prototype.x;
        this.y = prototype.y;
        this.colour = prototype.colour;
    }

    abstract public Prototype clone();
}
