package test06;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;
public class stream implements person{
    public static void main(String[] args) {
        String str = "123456";
        StringBuilder s = new StringBuilder(str);
        boolean contains = str.contains("1");
        s.append(100);
        System.out.println(s.reverse().toString());
        StringJoiner sj = new StringJoiner("---");
        System.out.println(sj + "1");
        sj.add(str);
        sj.add(str);
        System.out.println(sj);

        c t = new c();
        Object a = t.GetInstance();

//        System.out.println(Runtime.getRuntime().exit());

        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());
        System.out.println(Runtime.getRuntime().totalMemory());
        System.out.println(Runtime.getRuntime().maxMemory());
//        System.out.println(t.isNull());
        Random random = new Random();
        System.out.println(random);
        BigInteger i = new BigInteger(100, random);
        System.out.println(i);

        BigInteger i1 = new BigInteger("12345678901234567890");
        System.out.println(i1);

        var i2 = new BigInteger("10", 2);
        i2 = BigInteger.valueOf(100);
        i2 = BigInteger.valueOf(1000);
        System.out.println(i2);

        BigInteger i3 = BigInteger.valueOf(123);
        System.out.println(i2);

    }
    @Override
    public void game() {
        System.out.println(111);
    }

    @Override
    public void play() {

    }
}
