package UdpChatRoom;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp = new DatagramSocket(8888);
        byte[] buffer = new byte[1024];

        while (true) {


            DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
            udp.receive(dp);
            byte[] data = dp.getData();
            System.out.println(dp.getAddress() + "# "+ new String(data, 0, dp.getLength()));

        }


    }
}
