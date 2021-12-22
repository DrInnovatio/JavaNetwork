package First;

import java.io.*;

public class Ex01_05 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);

        System.out.println("Name = : ");
        String name = in.readLine();
        System.out.println("Age = : ");
        int age = Integer.parseInt(in.readLine());

        System.out.println("====");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);

    }
}
