package Third;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Ex03_02 {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        InetAddress ia = null;

        try{
            ia = InetAddress.getByName("127.0.0.1");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        try{
//            ds = new DatagramSocket();
//            ds = new DatagramSocket(54321);
            ds = new DatagramSocket(54321, ia);

        } catch (SocketException e) {
            e.printStackTrace();
        }
        System.out.println("socket = " + ds.toString());
    }
}
