package com.cike.java8.lambda;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 线程初始化
 * @Author kou
 * @Version 1.0
 **/
@Slf4j
public class LambdaExample1 {
    public static void main(String[] args) {
        // Old way
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }).start();

        // New way
        new Thread(
                () -> System.out.println("Hello world")
        ).start();


    }
}
