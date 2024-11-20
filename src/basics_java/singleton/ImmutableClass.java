package basics_java.singleton;

import java.util.ArrayList;
import java.util.List;

final public class ImmutableClass {
    final private String name;
    final private Integer[] integers;
    final List<Integer> list;

    ImmutableClass(String name, Integer[] integers, List<Integer> list) {
        this.name = name;
        this.integers = integers;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public Integer[] getIntegers() {
        return integers.clone();
    }

    public List<Integer> getList() {
        return new ArrayList<>(list);
    }
}
