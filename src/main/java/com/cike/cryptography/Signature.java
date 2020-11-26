package com.cike.cryptography;

import com.cike.hash.HashUtil;
import lombok.extern.slf4j.Slf4j;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * @Author Kou
 * @Date 2020/11/25
 * @Version 1.0
 **/
@Slf4j
public class Signature {

    /**
     * 数字签名
     *
     * @param strPrivateKey
     * @param data
     * @return
     * @throws Exception
     */
    public static String makeSigMsg(String strPrivateKey, String data) throws Exception {
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(strPrivateKey.getBytes()));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);
        data = HashUtil.sha1(data.getBytes());
        String encData = RSAUtil.privateKeyEncryptData(data, privateKey);
        return encData;
    }

    /**
     * 验证签名
     *
     * @param strPubKey
     * @param data
     * @param encMsg
     * @return
     * @throws Exception
     */
    public static boolean verifySigMsg(String strPubKey, String data, String encMsg) throws Exception {
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(strPubKey.getBytes()));
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        String desData = RSAUtil.publicKeyDecryptData(encMsg, publicKey);
        if (desData.equals(HashUtil.sha1(data.getBytes()))) {
            log.info("验证成功");
            return true;
        }
        return false;
    }
}
