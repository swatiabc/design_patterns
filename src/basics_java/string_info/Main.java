package basics_java.string_info;

public class Main {
    public static void main(String[] args) {

        // one object two reference
        String name ="SWATI";
        String name1 ="SWATI";

        // a new object is created and pointer reference is changed
        name = name + "asbc";

        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuffer.capacity());

        StringBuffer stringBuffer1 = new StringBuffer("swati");
        System.out.println(stringBuffer1.capacity());
        stringBuffer1.append("sfvfs");

        String str = stringBuffer1.toString();

        stringBuffer1.deleteCharAt(2);
        stringBuffer1.insert(3, "java");

        System.out.println( stringBuffer1);
    }
}
