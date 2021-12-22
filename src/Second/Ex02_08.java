package Second;

import com.sun.jmx.snmp.InetAddressAcl;

import java.io.*;
import java.net.*;

public class Ex02_08 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = null;
        try{
            ss = new ServerSocket();
        }catch(IOException ee){}
        //SocketAddress sa = new SocketAddress();
        InetAddress ia = null;
        try{
            ia = InetAddress.getByName("127.0.0.1");
        }catch(UnknownHostException ee){}
        InetSocketAddress isa = new InetSocketAddress(ia, 12345);
        try {
            ss.bind(isa);
            System.out.println("Server ready...");
        }catch(IOException ee){}

        Socket soc = null;
        try{
            soc = ss.accept();
        }catch(IOException ee){}

        System.out.println("Accessor : " + soc.toString());
    }
}
