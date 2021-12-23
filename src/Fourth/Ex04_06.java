package Fourth;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Ex04_06 {

    public static void main(String[] args) {
        URL url = null;
        try{
            url = new URL("http://www.naver.com");
        }catch(MalformedURLException ee){}

        URLConnection uc = null;
        try{
            uc = url.openConnection();
        }catch(IOException ee){}
        System.out.println("Output  = " + uc.getDoOutput());
        System.out.println("Input = " + uc.getDoInput());

        uc.setDoOutput(true);
        uc.setDoInput(true);
        OutputStream out = null;
        InputStream in = null;

        try{
            in = uc.getInputStream();
            //out = uc.getOutputStream();
        }catch(IOException ee){}

        //System.out.println("out = " + out.toString());
//        assert in != null;
//        System.out.println("in = " + in.toString());

        System.out.println("header field(1) = " + uc.getHeaderField(1));





    }
}
