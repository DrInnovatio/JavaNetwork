package Fourth;

import java.io.*;
import java.net.*;
import java.util.Date;


public class Ex04_05 {
    public static void main(String[] args) throws IOException {

        URL url = null;
        URLConnection uc = null;
        try{
            url = new URL("http://www.facebook .com");
        }catch (MalformedURLException ee){}

        try{
            uc = url.openConnection();
            uc.connect();
        }catch (IOException ee){}

        System.out.println("UC = " + uc.toString());
        System.out.println("interaction = " + uc.getAllowUserInteraction());
        try{
            System.out.println("content = " + uc.getContent());
        }catch (IOException ee){}
        System.out.println("encoding = " + uc.getContentEncoding());
        System.out.println("length = " + uc.getContentLength());
        System.out.println("type = " + uc.getContentType());
        System.out.println("date = " + new Date(uc.getDate()));

    }

}
