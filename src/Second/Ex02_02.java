package Second;

import java.net.*;

public class Ex02_02 {

    public static void main(String[] args) throws UnknownHostException {
        /*
        try{
            InetAddress ia = InetAddress.getByName("www.google.net");
            System.out.println(ia.toString());
        }catch (UnknownHostException ee){}

         */
        try{
            InetAddress ia = InetAddress.getLocalHost();
            System.out.println(ia.toString());
        }catch(UnknownHostException ee){}
    }
}
