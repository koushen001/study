package com.cike.day02.singleton;

/**
 * @Description 懒汉模式，双重同步锁单例模式，线程不安全
 * 1.分配对象的内存空间
 * 2.初始化对象
 * 3.设置instance指向刚分配的内存
 * jvm和cpu优化发生了指令重排
 * 1.分配对象的内存空间
 * 3.设置instance指向刚分配的内存
 * 2.初始化对象
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample4 {
    private SingletonExample4() {

    }

    private static SingletonExample4 instance = null;

    public static SingletonExample4 getInstance() {
        if (instance == null) {//双重检测机制
            synchronized (SingletonExample4.class) {//同步锁
                if (instance == null) {
                    {

                        instance = new SingletonExample4();
                    }
                }
            }
        }
        return instance;
    }
}
