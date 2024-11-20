package basics_java.interface_info;


import basics_java.interface_info.functional_interface_types.Consumer;
import basics_java.interface_info.functional_interface_types.Function;
import basics_java.interface_info.functional_interface_types.Predicate;
import basics_java.interface_info.functional_interface_types.Supplier;

public class Main {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (Integer a) -> {
            System.out.println("consumer interface: "+a);
        };
        consumer.done(10);

        Supplier<String> supplier = () -> "sds";
        supplier.done();

        Function<Integer, String> function = (Integer a) -> {
            System.out.println("functional"+ a);
            return "10";
        };

        function.done(10);

        Predicate<Integer> predicate = (Integer a) -> {
            return a > 10;
        };

        predicate.done(10);
    }
}
