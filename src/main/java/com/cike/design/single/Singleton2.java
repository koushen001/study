package com.cike.design.single;

/**
 * @Description 懒汉式单例模式，线程不安全
 * @Author kou
 * @Version 1.0
 **/
public class Singleton2 {
    private static Singleton2 SINGLETON = null;

    private Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }

}
