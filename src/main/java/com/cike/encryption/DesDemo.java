package com.cike.encryption;

import com.sun.org.apache.xml.internal.security.utils.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * @Author Kou
 * @Date 2020/5/29
 * @Version 1.0
 **/
public class DesDemo {
    public static void main(String[] args) throws Exception {
        //原文
        String input = "测试";
        //定义key，如果使用des加密，秘钥必须是8个字节
        String key = "12345678";
        //算法
        String transformation = "DES";
        //加密类型
        String algorithm = "DES";
        String encryptDES = encryptDES(input, key, transformation, algorithm);
        System.out.println("加密后：" + encryptDES);
        String decryptDES = decryptDES(encryptDES, key, transformation, algorithm);
        System.out.println("解密后：" + decryptDES);

    }

    private static String decryptDES(String encryptDES, String key, String transformation, String algorithm) throws Exception {
        //创建加密对象
        Cipher cipher = Cipher.getInstance(transformation);
        //创建加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        //进行加密初始化
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);
        //调用加密方法
        byte[] bytes = cipher.doFinal(Base64.decode(encryptDES));
        return new String(bytes);
    }

    private static String encryptDES(String input, String key, String transformation, String algorithm) throws Exception {
        //创建加密对象
        Cipher cipher = Cipher.getInstance(transformation);
        //创建加密规则
        SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algorithm);
        //进行加密初始化
        cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
        //调用加密方法
        byte[] bytes = cipher.doFinal(input.getBytes());
        String encode = Base64.encode(bytes);
        return encode;
    }
}
