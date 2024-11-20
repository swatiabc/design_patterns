package basics_java.collections;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class Student implements Comparable{
    int a;
    String name;

    public Student(int a, String name) {this.a = a; this.name = name;}

    @Override
    public int compareTo(@NotNull Object o) {
        Student student = (Student) o;
        if (student.a < a) return 1;
        return -1;
    }

    @Override
    public String toString() {
        return a+" "+name;
    }
}

public class Main {
    public static void main(String[] args) {
        Comparator<Integer>  com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10) return o1;
                return o2;
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(2);
        nums.add(9);
        nums.add(1);

        nums.sort(com);
        System.out.println(nums);

        List<Student> students =  new ArrayList<>();
        students.add(new Student(10, "Scscs"));
        students.add(new Student(12, "cdsd"));
        students.add(new Student(8, "dadas"));

        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.a < o2.a) return 1;
                return -1;
            }
        };

        students.sort(comparator);

        System.out.println(students);
        Collection<Object> arraylist1 = new ArrayList<>();
        arraylist1.add(9);
        arraylist1.add(10);

        for(Object o: arraylist1) {
            System.out.println((Integer) o);
        }

        List<Integer> arraylist = new ArrayList<>();
        arraylist.add(6);
        arraylist.add(7);

        arraylist.forEach((Integer i) -> System.out.println(i));

        for(Integer i: arraylist) {
            System.out.println(i);
        }

    }
}
