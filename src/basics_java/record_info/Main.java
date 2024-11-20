package basics_java.record_info;

import java.util.Objects;

class RecordExample {
    int a;
    int name;
    @Override
    public boolean equals(Object obj) {
        if (this ==obj) return true;
        if (obj==null || getClass() != obj.getClass()) return false;
        RecordExample recordExample = (RecordExample) obj;
        return a == recordExample.a && name == recordExample.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, name);
    }

    @Override
    public String toString() {
        return a+ " " + name;
    }
}

record Alien(int id, String name) {}

record Alien1(int id, String name) {
    Alien1 {
        id = id+10;
        name = name+"dd";
    }
}

record Alien2(int id, String name) implements Cloneable {
    static int sta;
    Alien2 {
        id = id+10;
        name = name+"dd";
    }

    public void show() {
        System.out.println("azdad");
    }
}


public class Main {
    public static void main(String[] args) {
        Alien a = new Alien(1, "name");
        Alien b = new Alien(1, "name"); // immutable

        System.out.println(a.equals(b));
        System.out.println(a);
    }
}
