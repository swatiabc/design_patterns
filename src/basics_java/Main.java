package basics_java;

class A{
    class B{

    }
    static class C{}
}

sealed class D extends Thread implements Cloneable permits F,E{}

non-sealed class F extends D{}
final class E extends D{}

class K extends F{}

class StaticBlock {
    int name;
    static int a;
    static {
        a=10;
        System.out.println("in static block");
    }

    StaticBlock() {
        name = 20;
        System.out.println("in constructor");
    }
}

public class Main {
    public static void main(String[] args) {
        A.B a = (new A()).new B();
        A.C c = new A.C();

    }
}




