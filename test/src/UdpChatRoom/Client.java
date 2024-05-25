package UdpChatRoom;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket udp = new DatagramSocket();

        Scanner sc = new Scanner(System.in);

        byte[] buffer;
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 8888;

        while (true) {
            System.out.print("PleaseEnter@");
            String msg = sc.nextLine();
            buffer = msg.getBytes();
            DatagramPacket send_packet = new DatagramPacket(buffer, buffer.length, address, port);

            udp.send(send_packet);
        }


    }
}
