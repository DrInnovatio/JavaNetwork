package Second;

import java.net.*;

public class Ex02_01 {

    public static void main(String[] args)   {

        try{
            InetAddress[] ia =
                    InetAddress.getAllByName("www.google.net");

            for(int i = 0; i < ia.length; i++){
                System.out.println(i + 1 + "th address. : " +ia[i].toString());
            }
        } catch (UnknownHostException e) {
            System.err.println(e.toString());
        }
    }
}
