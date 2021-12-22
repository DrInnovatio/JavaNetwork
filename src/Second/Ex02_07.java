package Second;
import java.io.*;
import java.net.*;

public class Ex02_07 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = null;

        try{
            ss = new ServerSocket(12345);
            System.out.println("Server ready...");
        }catch(IOException ee){
            System.err.println("the current port is opened.");
            return;
        }
        Socket soc = null;
        try{
            soc = ss.accept();
        }catch(IOException ee){}
        assert soc != null;
        System.out.println("accessor  : " + soc.toString());

    }
}
