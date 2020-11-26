package com.cike.hash;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;

import java.security.MessageDigest;

/**
 * @Author Kou
 * @Date 2020/11/24
 * @Version 1.0
 **/
public class HashUtil {
    /**
     * md5
     */
    public static String md5(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest(data);
        return bytes2HexStr(digest);
    }

    /**
     * sha1
     */
    public static String sha1(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA");
        byte[] digest = md.digest(data);
        return bytes2HexStr(digest);
    }

    /**
     * sha256
     */
    public static String sha256(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] digest = md.digest(data);
        return bytes2HexStr(digest);
    }

    /**
     * sha512
     */
    public static String sha512(byte[] data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-512");
        byte[] digest = md.digest(data);
        return bytes2HexStr(digest);
    }

    /**
     * ripemd160
     */
    public static String ripemd160Bytes(byte[] data) {
        RIPEMD160Digest rd = new RIPEMD160Digest();
        rd.update(data, 0, data.length);
        byte[] digest = new byte[rd.getDigestSize()];
        rd.doFinal(digest, 0);
        return bytes2HexStr(digest);
    }

    /**
     * 将字节数组转成16进制
     *
     * @param bytes
     * @return
     */
    public static String bytes2HexStr(byte[] bytes) {
        StringBuffer sb = new StringBuffer();
        for (byte b : bytes) {
            sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
        }
        return sb.toString();
    }

    public static byte[] hexStr2HexBytes(String hexStr) {
        if (null == hexStr || 0 == hexStr.length()) {
            return null;
        }
        hexStr = (hexStr.length() == 1) ? "0" + hexStr : hexStr;
        byte[] arr = new byte[hexStr.length() / 2];
        byte[] temp = hexStr.getBytes();
        for (int i = 0; i < temp.length / 2; i++) {
            arr[i] = unitBytes(temp[i * 2], temp[i * 2 + 1]);
        }
        return arr;
    }

    /**
     * 分组
     *
     * @param src0
     * @param src1
     * @return
     */
    private static byte unitBytes(byte src0, byte src1) {
        byte _b0 = Byte.decode("0x" + new String(new byte[]{src0})).byteValue();
        _b0 = (byte) (_b0 << 4);
        byte _b1 = Byte.decode("0x" + new String(new byte[]{src1})).byteValue();
        byte ret = (byte) (_b0 ^ _b1);
        return ret;
    }
}
