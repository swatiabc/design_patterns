package basics_java.interface_info;

public class Eagle implements BirdInterface {

    @Override
    public void fly(String value) {
        System.out.println("fly normal");
    }
}


class MainAnonymous {
     static void mainLambda() {
        BirdInterface birdInterface = (String value) -> {
            System.out.println(value);
        };

        birdInterface.fly("fly lambda");
    }

    public static void main(String args[]) {
        BirdInterface birdInterface = new BirdInterface() {
            @Override
            public void fly(String value) {
                System.out.println("fly anonymous");
            }
        };

        birdInterface.fly("fly anonymous");
        MainAnonymous.mainLambda();

        BirdInterface eagle = new Eagle();
        eagle.fly("fly interface");
    }


}

