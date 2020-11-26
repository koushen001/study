package hash;

import com.cike.hash.HashUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Kou
 * @Date 2020/11/24
 * @Version 1.0
 **/
@Slf4j
public class HashUtilTest {
    public static void main(String[] args) {
        String src = "123456";
        try {
            String md5 = HashUtil.md5(src.getBytes());
            log.info("md5:{}",md5);
            String sha1 = HashUtil.sha1(src.getBytes());
            log.info("sha1:{}",sha1);
            String sha256 = HashUtil.sha256(src.getBytes());
            log.info("sha256:{}",sha256);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("***************************");
        try {
            byte[] arrSrc = HashUtil.hexStr2HexBytes(src);
            String md5 = HashUtil.md5(arrSrc);
            log.info("md5:{}",md5);
            String sha1 = HashUtil.sha1(arrSrc);
            log.info("sha1:{}",sha1);
            String sha256 = HashUtil.sha256(arrSrc);
            log.info("sha256:{}",sha256);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
