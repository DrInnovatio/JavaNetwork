package Second;
import java.net.*;

public class Ex02_03 {

    public static void main(String[] args) throws UnknownHostException {
        /*
        InetAddress ia = InetAddress.getByName("www.facebook.com");
        byte[] bb = ia.getAddress();
        for(int i = 0; i < bb.length;  i++){
            System.out.println(bb[i] + "\t");
        }
         */
        try {
            byte[] bb = {-99, -16, -41, 35};
            //InetAddress ia = InetAddress.getByAddress(bb);
            InetAddress ia = InetAddress.getByAddress("www.naver.com", bb);
            System.out.println("ia = : " + ia);
            System.out.println("dns = : " + ia.getHostName());
            System.out.println("ip = : " + ia.getHostAddress());
            System.out.println("MCLinkLocal = : " + ia.isMCLinkLocal());
        }catch (UnknownHostException ee){}
    }
}
