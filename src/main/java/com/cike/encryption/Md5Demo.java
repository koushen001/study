package com.cike.encryption;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import java.security.MessageDigest;

/**
 * @Author Kou
 * @Date 2020/5/29
 * @Version 1.0
 **/
public class Md5Demo {
    public static void main(String[] args) throws Exception {
        String input = "aa";
        String algorithm = "MD5";
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        byte[] digest1 = digest.digest(input.getBytes());
        System.out.println(Base64.encode(digest1));
    }
}
