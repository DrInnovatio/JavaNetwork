package Third;

import sun.net.InetAddressCachePolicy;

import java.net.*;
import java.nio.charset.StandardCharsets;

public class Ex03_01 {

    public static void main(String[] args) throws UnknownHostException, SocketException {
        byte[] data = "asdf what's up?".getBytes();
        byte[] bindata = new byte[65508];

        DatagramPacket dp = null;

        //dp = new DatagramPacket(data, data.length);
        //dp = new DatagramPacket(bindata, bindata.length);

        InetAddress ia = null;
        InetSocketAddress isa = null;
        try{
            ia = InetAddress.getByName("www.naver.com");
            isa = new InetSocketAddress(ia, 54321);
        }catch(UnknownHostException ee){}

        dp = new DatagramPacket(data, 4, data.length - 4, isa);

        InetAddress ia1 = dp.getAddress();
        System.out.println("address = " + ia1.toString());
        byte[] bbb = dp.getData();
        System.out.println("data = : " + new String(bbb) );
        System.out.println("data length =  : " + dp.getLength() );
        System.out.println("data offset =  : " + dp.getOffset() );
        System.out.println("port  =  : " + dp.getPort() );
        InetSocketAddress isa1 = (InetSocketAddress) dp.getSocketAddress();
        System.out.println("Socket Address  =  " + isa1.toString());

        byte[] by = new byte[65508];
        byte[] by1 = "Merry Christmas".getBytes();

        DatagramPacket dp11 = new DatagramPacket(by, by.length);
        InetAddress inet = null;
        InetSocketAddress inetsoc = null;
        try{
             inet = InetAddress.getByName("www.google.com");
             inetsoc = new InetSocketAddress(inet, 54321);

        }catch (UnknownHostException ee){}
//        dp.setAddress(inet);
//        dp.setPort(54321);
        dp11.setSocketAddress(inetsoc);
        dp11.setData(by1);
    }
}
