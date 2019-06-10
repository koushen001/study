package com.cike.design.single;

/**
 * @Description 饿汉式单例模式
 * @Author kou
 * @Version 1.0
 **/
public class Singleton1 {
    private static final Singleton1 SINGLETON = new Singleton1();

    //限制产生多个对象
    private Singleton1() {

    }

    //通过该方法获得实例对象
    public static Singleton1 getInstance() {
        return SINGLETON;
    }

    //类中其他方法，尽量是static
    public static void doSomething() {

    }

}
