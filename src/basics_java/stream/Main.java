package basics_java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(300);
        list.add(800);
        list.add(100);
        list.add(876);
        list.add(987);
        list.add(342);

        list.forEach((Integer a) -> System.out.println("a"));

        long output = list.stream().filter((Integer sal) -> sal>800).count();
        System.out.println(output);

        Integer[] salArr = new Integer[]{1,2,3,4};

        Stream<Integer> stream = Arrays.stream(salArr);

        Stream<Integer> stream1 = Stream.of(salArr);

        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(100);
        streamBuilder.add(746);
        streamBuilder.add(34);
        streamBuilder.add(989);
        streamBuilder.add(90);
        Stream<Integer> stream2 = streamBuilder.build();

        Stream<Integer> stream3 = Stream.iterate(100, (Integer x) -> x+187 ).filter((Integer x) -> x>300)
                .map((Integer y) -> y+10)
                .distinct()
                .peek((Integer val) -> System.out.println(val+10))
                .limit(20)
                .sorted();


        List<Integer> list1 = stream3.collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = list.parallelStream().filter((Integer x) -> x<500).toList();
        System.out.println(list2);

    }
}
