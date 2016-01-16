package me.henrytao.crackingthecodeinterview.question;

import java.util.Arrays;

/**
 * Created by henrytao on 1/16/16.
 */
public class Q01_02 {

    private static String sort(String s) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);
        return new String(sChars);
    }

    public static boolean permutation(String s, String t) {
        s = s != null ? s : "";
        t = t != null ? t : "";
        if (s.length() != t.length()) {
            return false;
        }
        s = sort(s);
        t = sort(t);
        return s.equals(t);
    }
}
