package test07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String s = "adsf";
        Pattern regex = Pattern.compile("[a-z]+");
        Matcher m = regex.matcher(s);
        System.out.println(m.matches());
    }
    public static int subtraction(int n1, int n2) {
        return n1 - n2;
    }
}
