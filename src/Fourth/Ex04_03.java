package Fourth;

import java.net.*;

public class Ex04_03 {

    public static void main(String[] args) {
        URI uri = null;
        /*
        try{
            uri = new URI("http://www.daum.net");
        }catch(URISyntaxException ee){}
         */

        uri = URI.create("http://www.daum.net:80/index.home?name=James#abc ");
        System.out.println("uri  = " + uri.toString());
        //System.out.println("uri asc  = " + uri.toASCIIString());
        System.out.println("Fragment  = " + uri.getFragment());
        System.out.println("Authority  = " + uri.getAuthority());
        System.out.println("Host  = " + uri.getHost());
        System.out.println("Path  = " + uri.getPath());
        System.out.println("Port  = " + uri.getPort());
        System.out.println("Query  = " + uri.getQuery());
        System.out.println("Raw Query  = " + uri.getRawQuery());

    }
}
