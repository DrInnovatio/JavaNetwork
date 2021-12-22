package Second;

import java.io.*;
import java.net.*;

public class Ex02_09 {
    public static void main(String[] args) {
        for(int i = 1; i <= 65535; i++){
            try{
                ServerSocket imsi = new ServerSocket(i);

            }catch (IOException ee){
                System.err.println(i + "th port is open." );
            }
        }
    }
}
