package First;

import java.io.*;

public class Ex01_06 {
    public static void main(String[] args) throws IOException {

        File f = new File("ex01_04.txt");
        FileReader fr = new FileReader(f);
        BufferedReader in = new BufferedReader(fr);

        String str = in.readLine();
        int xx = Integer.parseInt(in.readLine().trim());

        System.out.println("The first = " + str);
        System.out.println("The second = " + xx);
    }
}
