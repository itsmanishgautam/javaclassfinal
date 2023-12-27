package serverprogramming;

import javax.xml.crypto.Data;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class serverUdp {

    public static void main(String[] args) {
        int port = 3421;
        try{
            DatagramSocket serverSocket = new DatagramSocket(port);

            System.out.println("Server Started");
            byte[] datas= new byte[30000];
            DatagramPacket messageFromClientDp = new DatagramPacket(datas, datas.length);
            serverSocket.receive(messageFromClientDp);

            String message= new String(messageFromClientDp.getData());
            System.out.println("Message from Client is: " +message);

            //reply to client
            String ServerResponse= "Please send us your Inquiry:";
            byte[] sRs= ServerResponse.getBytes();
            //DatagramPacket dpResponse= new DatagramPacket(sRs, sRs.length, inetaddress, messageFromClientDp.getPort());
            //serverSocket.send(dpResponse);


        }catch (Exception e){




        }
    }

}

