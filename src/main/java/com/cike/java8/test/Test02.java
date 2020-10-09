package com.cike.java8.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author Kou
 * @Date 2020/5/27
 * @Version 1.0
 **/
public class Test02 {
    public static void main(String[] args) {
        System.out.println(coutWord("abab", "ab"));
    }

    public static int coutWord(String str, String word) {
        // 根据指定的字符构建正则
        Pattern pattern = Pattern.compile(word);
        // 构建字符串和正则的匹配
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        // 循环依次往下匹配
        while (matcher.find()) { // 如果匹配,则数量+1
            count++;
        }
        return count;
    }
}
