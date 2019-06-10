package com.cike.java8.lambda;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 线程初始化
 * @Author kou
 * @Version 1.0
 **/
@Slf4j
public class LambdaExample5 {
    public static void main(String[] args) {
        //使用Lambda
        Runnable r1 = () -> System.out.println("Hello World 1");
        //匿名类
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World 2");
            }
        };

        process(r1);
        process(r2);
        process(() -> System.out.println("Hello World 3"));

    }

    public static void process(Runnable r) {
        r.run();
    }
}
