package com.cike.singleton;

/**
 * @Description 懒汉模式，双重同步锁单例模式，线程安全
 * 1.分配对象的内存空间
 * 2.初始化对象
 * 3.设置instance指向刚分配的内存
 * jvm和cpu优化发生了指令重排
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample5 {
    private SingletonExample5() {

    }

    //volatile限制jvm和cpu优化发生指令重排
    private static volatile SingletonExample5 instance = null;

    public static SingletonExample5 getInstance() {
        if (instance == null) {//双重检测机制
            synchronized (SingletonExample5.class) {//同步锁
                if (instance == null) {
                    {

                        instance = new SingletonExample5();
                    }
                }
            }
        }
        return instance;
    }
}
