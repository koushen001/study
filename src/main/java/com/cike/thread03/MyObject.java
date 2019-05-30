package com.cike.thread03;

/**
 * @Description 对象锁的同步和异步问题
 * 同步：synchronized
 * 同步的概念就是共享，如果不是共享的资源，就没有必要进行同步。
 * 异步：asynchronized
 * 异步的概念就是独立，相互之间不受到任何制约。就好像我们学习http的时候，在页面间发起的Ajax请求，
 * 我们还可以继续浏览或操作页面的内容，二者之间没有任何关系。
 * 同步的目的就是为了线程安全，其实对于线程安全来说，需要满足两个特性：
 * 原子性（同步）
 * 可见性
 * @Author CIKE
 * @Version 1.0
 **/
public class MyObject {
    public synchronized void method1() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
            System.out.println(Thread.currentThread().getName() + " stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //synchronized
    public void method2() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        final MyObject myObject = new MyObject();
        /**
         * 分析：
         * t1线程先持有myObject对象的Lock锁，t2线程可以以异步的方式调用对象中的非synchronized修饰的方法
         * t1线程先持有myObject对象的Lock锁，t2线程如果在这个时候调用对象中的同步(synchronized)方法则需要等待，也就是同步
         */

        Thread t1 = new Thread(() -> myObject.method1(), "t1");
        Thread t2 = new Thread(() -> myObject.method2(), "t2");
        t1.start();
        t2.start();
    }
}
