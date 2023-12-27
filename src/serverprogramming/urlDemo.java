package serverprogramming;

import java.net.URL;

public class urlDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("www.google.com");
            System.out.println("PortNUmber:" + url.getPort());
            System.out.println("Host:" + url.getHost());
            System.out.println(("Query Parameter:" + url.getQuery()));


        }catch(Exception e){

        }
    }
}
