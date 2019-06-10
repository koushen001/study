package com.cike.design.single;

/**
 * @Description 懒汉式单例模式，线程不安全
 * @Author kou
 * @Version 1.0
 **/
public class Singleton2 {
    private static Singleton2 SINGLETON = null;

    //限制产生多个对象
    private Singleton2() {

    }

    //通过该方法获得实例对象
    public static Singleton2 getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Singleton2();
        }
        return SINGLETON;
    }

    //类中其他方法，尽量是static
    public static void doSomething() {

    }

}
