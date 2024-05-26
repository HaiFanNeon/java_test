package test15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class client {
    public static void main(String[] args) throws IOException {
        DatagramSocket client = new DatagramSocket(8888);

        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);

        client.receive(dp);

        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress addr = dp.getAddress();
        int port = dp.getPort();
        System.out.println("recv" + new String(buf, 0, len));
        System.out.println("send" + addr + "这台电脑发出的");

        client.close();
    }
}
