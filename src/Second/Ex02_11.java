package Second;

import java.io.*;
import  java.net.*;

public class Ex02_11 {
    public static void main(String[] args) {
        InetAddress ia = null;
        Socket soc  = null;

        try{
            ia = InetAddress.getByName("192.168.1.99");
        }catch(UnknownHostException ee){}

        try{
            soc = new Socket(ia, 12345);
        }catch(IOException ee){}
    }
}