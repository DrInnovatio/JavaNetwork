package Fourth;

import java.io.*;
import java.net.*;

public class Ex04_01 {

    public static void main(String[] args) throws IOException {
        String spec = "http://urbanboy400@www.naver.com:80/index.html?name=aaa&id=bbb&pass=ccc#kim"; // :80  or :9999
        URL url = null;
        try{
            url = new URL(spec);
        }catch (MalformedURLException e){
            System.err.println("URL object creation error = : " + e.toString());
            System.exit(-1);
        }
        System.out.println("URL = : " + url.toString());
        System.out.println("authority = " + url.getAuthority());
        try{
            System.out.println("content input = : " + url.getContent());
        }catch (IOException e){}
        System.out.println("Default Port = : " + url.getDefaultPort());
        System.out.println("Port = : " + url.getPort());
        System.out.println("Protocol = : " + url.getProtocol());
        System.out.println("File = : " + url.getFile());
        System.out.println("Path = : " + url.getPath());
        System.out.println("Query = : " + url.getQuery());
        System.out.println("Reference = : " + url.getRef());
        System.out.println("User Info = : " + url.getUserInfo());
    }
}
