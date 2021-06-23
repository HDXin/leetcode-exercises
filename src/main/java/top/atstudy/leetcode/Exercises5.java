package top.atstudy.leetcode;

import cn.hutool.core.util.RandomUtil;

/**
 * @Author: dexin.huang or harley
 * @Email: dexin.huang@paat.com
 * @Date: 2021/4/13 19:46
 * @Description
 */
public class Exercises5 {

    public static void main(String[] args) {

        String a = "abcedfghijklmnopqrstuvwxyz0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            sb.append((char) a.getBytes()[RandomUtil.randomInt(0, 61)]);
        }

        System.out.println(" ==>> " + longestPalindrome(sb.toString()));

    }

    public static String longestPalindrome(String s) {

        System.out.println(s);
        byte[] bs = s.getBytes();

        int position = 0;
        byte b;
        int mark = 0;


        return "";
    }

}