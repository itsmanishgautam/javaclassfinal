package serverprogramming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.rmi.server.RMIClientSocketFactory;
import java.sql.ClientInfoStatus;

public class clientudp {
    public static void main(String[] args) {

        try {
            //creatingSocket
            DatagramSocket clientSocket = new DatagramSocket();

            //createdatagrampacket
            String inputMessage= "This is Manish Gautam";
            byte[] IM= inputMessage.getBytes();

            InetAddress inetAddress= InetAddress.getByName("localhost");
            DatagramPacket Dp= new DatagramPacket(IM,IM.length,null,3421);

            //senddatagrampacket
            clientSocket.send(Dp);


            byte[] datas= new byte[30000];
            DatagramPacket messageFromClientDp = new DatagramPacket(datas, datas.length);

            clientSocket.receive(messageFromClientDp);

            String message= new String(messageFromClientDp.getData());
            System.out.println("Message from serverdp is: " +message);

        }catch(Exception e){

        }

    }
}
