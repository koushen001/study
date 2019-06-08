package com.cike.juc.singleton;

/**
 * @Description 饿汉模式，线程安全，私有构造函数在创建过程中没有太多处理，一定会是使用，否则会造成资源浪费
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample2 {
    private SingletonExample2() {

    }

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance() {
        return instance;
    }
}
