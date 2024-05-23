package test11;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class test2 {
    public static void main(String[] args) throws IOException {

        String ans = simplifyPath("/home/");
        System.out.println(ans);

    }

    public static String[] Util(String path) {
        String[] ret = new String[path.split("/").length];
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < path.length();) {
            if (path.charAt(i) == '/') {
                sb.append(path.charAt(i++));
                while (i < path.length() && path.charAt(i) != '/') {
                    sb.append(path.charAt(path.charAt(i++)));
                }
                sb = new StringBuilder();
                continue;
            }
            i++;
        }
        return ret;
    }

    public static String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String[] ans = Util(path);
        for (String s : ans) {
            stk.push(s);
            if (stk.size() > 1 && s == "/") stk.pop();
            else if (s == "/..") stk.pop();
        }
        StringBuilder sb = new StringBuilder();
        stk.stream().forEach(s->sb.append(s));
        return sb.toString();
    }
}
