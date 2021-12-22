package Second;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;

public class Ex02_05 {
    public static void main(String[] args) throws IOException {
        InetAddress ia = null;
        Socket soc = null;
        OutputStream os = null;
        InputStream is = null;
        try{
            ia = InetAddress.getByName(  "www.facebook.com");
        }catch (UnknownHostException e){}
        soc = new Socket(ia, 80);
        os = soc.getOutputStream();
        is = soc.getInputStream();
        System.out.println("Soc = : " + soc.toString());
        System.out.println("OS = " + os);
        System.out.println("IS = " + is);
    }
}
