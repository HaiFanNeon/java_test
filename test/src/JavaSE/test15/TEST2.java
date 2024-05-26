package test15;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TEST2 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-5A1B7J0");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);

        String ip = address.getHostAddress();
        System.out.println(ip);

    }
}
