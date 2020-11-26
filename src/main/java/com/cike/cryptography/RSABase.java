package com.cike.cryptography;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author Kou
 * @Date 2020/11/24
 * @Version 1.0
 **/
@Slf4j
public class RSABase {
    public static void main(String[] args) {
        int p = 11, q = 3;
        int N = 0, F = 0, e = 0, d = 0, c = 0, m = 0;
        N = p * q;
        F = (p - 1) * (q - 1);

        for (int i = 2; i < N; i++) {
            if ((F + 1) % i == 0) {
                e = i;
                break;
            }
        }
        d = (F + 1) / e;
        m = 31;
        c = (int) (Math.pow(m, e) % N);
        log.info("c:{}", c);
        m = (int) (Math.pow(c, d) % N);
        log.info("m:{}", m);
    }
}
