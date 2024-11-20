package basics_java.singleton;

// eager
public class SingletonExample {
    private static SingletonExample singletonExample = new SingletonExample();

    private SingletonExample() {

    }

    public static SingletonExample getInstance() {
        return singletonExample;
    }
}

//lazy
class SingleTonLazy {
    private static SingleTonLazy singletonExample;

    private SingleTonLazy() {

    }

    public static SingleTonLazy getInstance() {
        if( singletonExample == null) {
            singletonExample = new SingleTonLazy();
        }

        return singletonExample;

    }
}

//synchronization
class SingletonSync {
    private static SingletonSync singletonSync;
    private SingletonSync() {

    }

    synchronized public static SingletonSync getInstance() {
        if( singletonSync == null) {
            singletonSync = new SingletonSync();
        }

        return singletonSync;
    }
}

// double check lock:
class SingletonDoubleCheck {
    volatile private static SingletonDoubleCheck singletonDoubleCheck;
    private SingletonDoubleCheck() {

    }

    public static SingletonDoubleCheck getInstance() {
        if(singletonDoubleCheck == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (singletonDoubleCheck == null) {
                    singletonDoubleCheck = new SingletonDoubleCheck();
                }
            }
        }
        return singletonDoubleCheck;
    }
}

// bill pugh solution:
class SingletonBillPugh {
    private SingletonBillPugh() {}

    static class InsideSingletonHelper {
        private final static SingletonBillPugh singleton = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return InsideSingletonHelper.singleton;
    }

}

// enum
enum SingletonEnums {
    instance;
}
