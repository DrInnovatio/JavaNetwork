package ServerSocket;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;


class Ex08_01sub extends Thread {
    private ServerSocket ss;
    public Ex08_01sub(){
        try{
            ss = new ServerSocket(80);
            System.out.println("Server Ready---");
            this.start();
        }catch (IOException ee){
            System.out.println("the port is open.");
            System.exit(0);
        }
    }
    public void run(){
        while(true){
            try{
                Socket soc = ss.accept();
                System.out.println("Accessor : " + soc.toString());
                OutputStream os = soc.getOutputStream();
                String data = "<html><body>How are you?</body></html>\n";
                os.write(data.getBytes());
                os.close();
            }catch (Exception ee){}
        }
    }
}

public class Ex08_01 {

    public static void main(String[] args) {
        Ex08_01sub ex = new Ex08_01sub();
    }
}
//192.168.1.99
//HTTP1.0 200 OK