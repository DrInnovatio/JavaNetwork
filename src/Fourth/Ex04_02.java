package Fourth;

import java.io.*;
import java.net.*;

public class Ex04_02 {
    public static void main(String[] args) {
        URL url = null;
        try{
            url = new URL("http//www.google.com/index.html");
        }catch(MalformedURLException ee){}

        InputStream inputStream = null;
        try{
            assert url != null;
            inputStream = url.openStream();
        }catch (IOException ee){}

        while(true){
            try{
                assert inputStream != null;
                int xx = inputStream.read();
                if(xx == -1){
                    break;
                }
                System.out.println((char)xx );
            }catch(IOException ee){}
        }
    }
}
