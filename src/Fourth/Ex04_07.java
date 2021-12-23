package Fourth;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.UnsupportedEncodingException;
import java.net.*;

public class Ex04_07 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String data = "박재우 보냄";
        String dataConver = null;

        dataConver = URLEncoder.encode(data, "KSC5601");
        System.out.println("data = " + data );
        System.out.println("data conver = " + dataConver);
        System.out.println("======");

        dataConver = URLDecoder.decode(dataConver, "KSC5601");
        System.out.println("data = " + data );
        System.out.println("data conver = " + dataConver);
    }
}
