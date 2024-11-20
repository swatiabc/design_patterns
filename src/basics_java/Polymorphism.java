package basics_java;

public class Polymorphism {
 public String run() {
     return "fvfsvfs";
 }
}

class B extends Polymorphism {
    public String run() {
        return "jnij";
    }
}

class C {
    public void main() {
        Polymorphism polymorphism = new B();
        polymorphism.run(); // runtime polymorphism
        var i=new B();
    }
}

/*
* compile time: overriding
* runtime: overloading
* */