package com.cike.day02.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description 修饰类，修饰静态方法：作用于所有的对象
 * synchronized：不可中断锁，适合竞争不激烈，可读性好
 * Lock:可中断锁，多样化同步，竞争激烈时能维持常态
 * Atomic：竞争激烈时能维持常态，比Lock性能好，只能同步一个值
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class SynchronizedExample2 {
    //修饰一个类
    public static void test1(int j) {
        synchronized (SynchronizedExample2.class) {
            for (int i = 0; i < 10; i++) {
                log.info("test1 - {} - {}", j, i);
            }
        }
    }

    //修饰一个静态方法
    public static synchronized void test2() {
        for (int i = 0; i < 10; i++) {
            log.info("test2 - {}", i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample2 example1 = new SynchronizedExample2();
        SynchronizedExample2 example2 = new SynchronizedExample2();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            example1.test1(1);
        });
        executorService.execute(() -> {
            example2.test1(2);
        });
    }
}
