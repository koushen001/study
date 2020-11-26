package com.cike.cryptography;

import lombok.extern.slf4j.Slf4j;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

import java.security.*;
import java.util.Base64;

/**
 * @Author Kou
 * @Date 2020/11/24
 * @Version 1.0
 **/
@Slf4j
public class RSAKeyCeator {
    public static void main(String[] args) {
        createKeyPairs();
    }

    public static void createKeyPairs() {
        Security.addProvider(new BouncyCastleProvider());
        try {
            KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
            generator.initialize(512, new SecureRandom());
            KeyPair keyPair = generator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();
            String strPrivateKey = Base64.getEncoder().encodeToString(privateKey.getEncoded());
            log.info("strPrivateKey:{}", strPrivateKey);
            String strPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
            log.info("strPublicKey:{}", strPublicKey);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
