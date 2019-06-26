package com.cike.design.single;

/**
 * @Description 饿汉式单例模式
 * @Author kou
 * @Version 1.0
 **/
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    private Singleton1() {

    }

    public static Singleton1 getInstance() {
        return SINGLETON;
    }

}
