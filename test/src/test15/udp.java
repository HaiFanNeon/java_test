package test15;

import java.io.IOException;
import java.net.*;

public class udp {
    public static void main(String[] args) {


            try {
                DatagramSocket udp = new DatagramSocket();

                String str = "hello world你好世界";
                byte[] buf = str.getBytes();
                InetAddress address = InetAddress.getByName("127.0.0.1");
                int port = 8888;
                DatagramPacket dp = new DatagramPacket(buf, buf.length, address, port);
                udp.send(dp);
                udp.close();

            } catch (SocketException e) {
                throw new RuntimeException(e);
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
