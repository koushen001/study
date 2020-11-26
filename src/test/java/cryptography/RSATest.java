package cryptography;

import com.cike.cryptography.RSAUtil;
import com.cike.cryptography.Signature;
import lombok.extern.slf4j.Slf4j;

import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

/**
 * @Author Kou
 * @Date 2020/11/24
 * @Version 1.0
 **/
@Slf4j
public class RSATest {
    public static void main(String[] args) throws Exception {
        String data = "区块链技术abc123$#&";
        String strPrivateKey = "MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAjl1PveFoJaSf5fJHOLsrxsxSA6oafMbo6Mfc36B6tgG/3BshGkL2PFc7uiBjmZbgSJIqwxHQQSDdR8o9es2mWwIDAQABAkAcuMqrvlwqrAnudHDWCz0LwJETWDA72E2JGTmAjHn1WhjAW3lRV1n7hmMpUVTY/pY4+Rb9noNk1dMfK5n7JOKBAiEA/q2zVY5KHgdyoypwGmyy0DRf1L4y5MiUUtxwUOMVbmECIQCPGmt66LOU43NbCR2PVfLU4SJEOzWQIpkqU9UKyEz2OwIhAPaDk+7giAWBGAmv7krlpD+8MnZulDy3mjqKfX0OEZSBAiBdquxpIgHR1eM+1kOb+6UbxFUalirkMlFRDFhpW1xM2wIgFd5fiCKctndtP39xi/e5ftVrYajFhAJFAWNTsUjr5yE=";
        String strPublicKey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAI5dT73haCWkn+XyRzi7K8bMUgOqGnzG6OjH3N+gerYBv9wbIRpC9jxXO7ogY5mW4EiSKsMR0EEg3UfKPXrNplsCAwEAAQ==";
        //公钥规则对象
        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.getDecoder().decode(strPublicKey.getBytes()));
        //私钥规则对象
        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(Base64.getDecoder().decode(strPrivateKey.getBytes()));

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");

        PublicKey publicKey = keyFactory.generatePublic(x509EncodedKeySpec);
        PrivateKey privateKey = keyFactory.generatePrivate(pkcs8EncodedKeySpec);

        String encData = RSAUtil.publicKeyEncrytData(data, publicKey);
        log.info("密文:{}", encData);

        String result = RSAUtil.privateKeyDecryptData(encData, privateKey);
        log.info("明文：{}", result);

        String encData2 = Signature.makeSigMsg(strPrivateKey, data);
        log.info("encData2:{}", encData2);

        Signature.verifySigMsg(strPublicKey, data, encData2);
    }
}
