package test16TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);

        OutputStream os = socket.getOutputStream();

        os.write("年候鸟后".getBytes());

        os.close();
    }
}
