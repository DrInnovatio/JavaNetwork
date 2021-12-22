package First;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.io.*;

public class Ex01_01 {

    public static void main(String[] args) throws IOException{
        //System.out.println("Test");
        FileOutputStream fos = new FileOutputStream(FileDescriptor.out);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);

        byte[] bb = {'a', 'b', 'c'};
        System.out.write(bb);
        dos.write(bb);
        dos.writeInt(12);
        dos.writeFloat(14.4f);
        dos.flush();

    }
}
