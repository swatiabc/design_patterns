package basics_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("enter number");
        int num = System.in.read();

        System.out.println(num);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in); // from input, file, system
        /* these are resources are should be closed
         */

        int num2 = Integer.parseInt(bf.readLine());
        System.out.println(num2);

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.println(num3);
    }
}
