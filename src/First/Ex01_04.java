package First;

import java.io.*;

public class Ex01_04 {

    public static void main(String[] args) throws IOException {
         File f = new File("ex01_04.txt");
         //OutputStreamWriter osw = new OutputStreamWriter(f);
         FileWriter osw = new FileWriter(f);
         BufferedWriter bw = new BufferedWriter(osw);
         PrintWriter out = new PrintWriter(bw);

         out.println("Test");
         out.println("한글?");
         out.println(12);
         out.flush();
    }
}
