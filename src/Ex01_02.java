import java.io.*;

public class Ex01_02 {

    public static void main(String[] args) throws IOException{
        File f = new File("ex01_02.txt");
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        byte[] bb = {65, 66, 67};
        dos.write(bb);
        dos.writeByte(68);
        dos.writeChar('\n');
        dos.writeChars("Test");
        dos.writeInt(12);
        dos.flush();
        dos.close();
    }
}
