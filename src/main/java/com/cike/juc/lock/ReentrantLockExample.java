package com.cike.juc.lock;


import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReentrantLockExample
 * @Description 一种可重入互斥锁，其基本行为和语义与使用同步方法和语句访问的隐式监视器锁相同，但具有扩展功能
 * @Author kouliang
 * @Version 1.0
 **/
@Slf4j
public class ReentrantLockExample {

    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        try {
            //查询当前线程对此锁定的保持数
            int holdCount = lock.getHoldCount();
            log.info("当前线程对此锁定的保持数：{}", holdCount);
        } finally {
            lock.unlock();
        }
    }
}
