package test09;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        String s = "il**autonrd**cl**nh*up*afpizp****d*a****lst";
        List<Character> list = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                list.remove(list.get(list.size() - 1));
            }
            else {
                list.add(ch);
            }
        }
        String ans = "";
        for (var c : list) {
            ans += c;
        }

        System.out.println(ans);

    }
}
