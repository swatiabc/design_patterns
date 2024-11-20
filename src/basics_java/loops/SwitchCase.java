package basics_java.loops;

public class SwitchCase {
    public void main() {
        int a = 0, b;
        switch (a) {
            case 1: b=1; break;
            case 2: b=2; break;
            default: b=10;
        }

        switch (a) {
            case 1 -> b=1;
            case 2,3 -> b=3;
        }

        int c = switch (a) {
            case 1,2 -> 3;
            default -> 4;
        };

        int d = switch (a) {
            case 1,2: yield 3;
            default: yield 4;
        };





        for(int i=0;i<7;i++) {}

        int[] nums = new int[]{1,2,3,4};

        for(int n : nums) {
        }

    }
}
