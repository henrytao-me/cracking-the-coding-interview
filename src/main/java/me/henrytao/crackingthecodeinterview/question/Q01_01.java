package me.henrytao.crackingthecodeinterview.question;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by henrytao on 1/16/16.
 */
public class Q01_01 {

    public static boolean isUniqueLetter(String str) {
        str = str != null ? str : "";
        int i = 0;
        int checker = 0;
        int code = 0;
        for (int n = str.length(); i < n; i++) {
            code = str.charAt(i) - 'a';
            if ((checker & (1 << code)) > 0) {
                return false;
            }
            checker |= (1 << code);
        }
        return true;
    }

    public static boolean isUnique(String str) {
        Map<Integer, Integer> checkers = new HashMap<>();
        str = str != null ? str : "";
        int i = 0;
        int max = 30;
        int code, segment, key;
        for (int n = str.length(); i < n; i++) {
            code = (int) str.charAt(i);
            segment = Integer.valueOf(code / max);
            key = code % max;
            if (!checkers.containsKey(segment)) {
                checkers.put(segment, 0);
            }
            if ((checkers.get(segment) & (1 << key)) > 0) {
                return false;
            }
            checkers.put(segment, checkers.get(segment) | (1 << key));
        }
        return true;
    }
}
