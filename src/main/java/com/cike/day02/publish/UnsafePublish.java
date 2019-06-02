package com.cike.day02.publish;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Description 不安全的发布对象，线程不安全，使一个对象能够被当前范围之外的代码所使用
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class UnsafePublish {
    private String[] states = {"a", "b", "c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublish = new UnsafePublish();
        log.info("{}", Arrays.toString(unsafePublish.states));
        unsafePublish.getStates()[0] = "d";
        log.info("{}", Arrays.toString(unsafePublish.states));
    }
}
