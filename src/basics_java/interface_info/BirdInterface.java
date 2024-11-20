package basics_java.interface_info;

@FunctionalInterface
public interface BirdInterface {
    void fly(String value);

    default void eat(String v) {
        System.out.println(v);
    }

    static void poop() {
        System.out.println("poop");
    }
}

@FunctionalInterface
interface NewBird extends BirdInterface {
    void fly(String value);
}


