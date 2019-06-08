package com.cike.juc.aqs;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Description TODO
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class FutureTaskExample {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<String> future = new FutureTask<String>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("do something in callable");
                Thread.sleep(5000);
                return "Down";
            }
        });
        new Thread(future).start();
        log.info("do something in main");
        Thread.sleep(1000);
        String result = future.get();
        log.info("result :{}", result);


    }
}
