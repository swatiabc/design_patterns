package basics_java.exception_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends RuntimeException {
    MyException() {
        System.out.println("custom ");
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        try  {
            doStuff();
            return;
        }
        catch (MyException exception) {
            System.out.println("run exception");
        }
        catch (RuntimeException throwable) {
            System.out.println("exception");
        }
        finally {
            System.out.println("finally");
        }
        BufferedReader bufferedReader = null;
        InputStreamReader inputStreamReader;

        try{
            inputStreamReader = new InputStreamReader(System.in);
            bufferedReader = new BufferedReader(inputStreamReader);
            int nums = Integer.parseInt(bufferedReader.readLine());
            System.out.println(nums);
        }
        catch (Exception ex) {}
        finally {
            bufferedReader.close();

        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int nums = Integer.parseInt(bufferedReader.readLine());
            System.out.println(nums);
        }


        return;
    }

    public static void doStuff() throws MyException {
        throw new RuntimeException();
    }
}


