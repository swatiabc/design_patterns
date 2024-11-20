package basics_java.interface_info.functional_interface_types;

@FunctionalInterface
public interface Function<T, R> {
    R done(T a);
}
