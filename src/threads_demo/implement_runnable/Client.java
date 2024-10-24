package threads_demo.implement_runnable;


class Counter {
    int count;
    Counter() {
        count=0;
    }

    public synchronized void increament() {
        count++;
    }
}


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Runnable aClass = new AClass();
        Runnable bClass = new BClass();

        Counter counter = new Counter();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=10000;i++) {
                    counter.increament();
                }
            }
        };

        Runnable lambdaObj = () -> {
            for(int i=0;i<=10000;i++) {
               counter.increament();
            }
        };

        Thread t1 = new Thread(aClass);
        Thread t2 = new Thread(bClass);
        Thread t3 = new Thread(runnable);
        Thread t4 = new Thread(lambdaObj);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(counter.count);
    }
}
