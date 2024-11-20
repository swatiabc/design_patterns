package basics_java.threads_demo.extend_thread;

public class Client {
    public static void main(String  args[]) {
        Aclass aclass = new Aclass();
        Bclass bclass = new Bclass();

        System.out.println( "a priority: "+aclass.getPriority());
        System.out.println("b priority: "+ bclass.getPriority());

        aclass.start();
        bclass.start();
    }
}
