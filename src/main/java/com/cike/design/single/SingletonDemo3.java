package com.cike.design.single;

/**
 * 双重检测锁单例模式
 */
public class SingletonDemo3 {

    private static SingletonDemo3 instance;

    private SingletonDemo3() {

    }

    public static SingletonDemo3 getInstance() {
        if (instance == null) {
            SingletonDemo3 singletonDemo3;
            synchronized (SingletonDemo3.class) {
                singletonDemo3 = instance;
                if (singletonDemo3 == null) {
                    synchronized (SingletonDemo3.class) {
                        if (singletonDemo3 == null) {
                            singletonDemo3 = new SingletonDemo3();
                        }
                        instance = singletonDemo3;
                    }
                }
            }
            instance = new SingletonDemo3();
        }
        return instance;
    }
}
