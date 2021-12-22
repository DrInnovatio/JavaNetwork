package Second;

import java.io.*;
import  java.net.*;

public class Ex02_10 {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket soc = null;
        try{
            ss = new ServerSocket(12345);
            System.out.println("Server Ready....");
        }catch(IOException ee){}

        try{
            soc = ss.accept();
            System.out.println("Accessor : " + soc.toString());
            ss.close();
        }catch(IOException ee){}
    }
}
