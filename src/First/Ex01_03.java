package First;

import java.io.*;

public class Ex01_03 {
    public static void main(String[] args) throws IOException{
        File f = new File("ex01_02.txt");
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);

        //System.out.println("Enter = ");
        //int x = dis.read();
        //System.out.println("Result = " + x);

        byte a = dis.readByte();
        byte b = dis.readByte();
        byte c = dis.readByte();
        byte d = dis.readByte();
        char e = dis.readChar();

        byte a1 = dis.readByte();
        byte b1 = dis.readByte();
        byte c1 = dis.readByte();
        byte d1 = dis.readByte();
        int f1 = dis.readInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println("====");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(f1);

    }
}
