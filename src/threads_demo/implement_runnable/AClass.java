package threads_demo.implement_runnable;

public class AClass implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<=5;i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
