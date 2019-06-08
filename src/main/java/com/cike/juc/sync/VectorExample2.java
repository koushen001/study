package com.cike.juc.sync;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Vector;

/**
 * @Description 线程不安全
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class VectorExample2 {
    private static List<Integer> vector = new Vector<>();

    public static void main(String[] args) throws Exception {
        while (true) {
            for (int i = 0; i < 10; i++) {
                vector.add(i);
            }
            Thread thread1 = new Thread() {
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            };
            Thread thread2 = new Thread() {
                public void run() {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.get(i);
                    }
                }
            };
            thread1.start();
            thread2.start();
        }
    }

}
