package Third;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class Ex03_03 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = null;
        try {
            ds = new DatagramSocket();
        } catch (IOException ee) {
        }

        InetSocketAddress isa = null;
        isa = new InetSocketAddress("127.0.0.1", 54321);

        try {
            ds.bind(isa);
        } catch (SocketException ee) {}

        try {
            System.out.println("buffer size = " + ds.getReceiveBufferSize());
            System.out.println("sent buffer size = " + ds.getSendBufferSize());
            System.out.println("Timeout  = " + ds.getSoTimeout()); // Zero is the infinite value.
            System.out.println("Traffic  = " + ds.getTrafficClass());
            System.out.println("Broad cast = : " + ds.getBroadcast());
        } catch (SocketException ee) {}
        ds.setSoTimeout(2000);
        byte[] bb = new byte[65508];
        DatagramPacket dp = new DatagramPacket(bb, bb.length);
        try{
            ds.receive(dp);
        }catch (java.io.IOException ee) {
            System.out.println("tired of waiting for it.");
        }
        System.out.println("Testing");

        byte[] bb1 = "teststststs".getBytes(StandardCharsets.UTF_8);
        DatagramPacket dpdp = null;

        try{
            dpdp = new DatagramPacket(bb1,
                    bb1.length, InetAddress.getByName("127.0.0.1"), 54321);
        }catch(UnknownHostException ee){}
        try{
            ds.send(dpdp);
        }catch(java.io.IOException ee){}
    }
}
