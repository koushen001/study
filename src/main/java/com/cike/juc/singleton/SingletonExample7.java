package com.cike.juc.singleton;

/**
 * @Description 枚举实现单例模式，线程安全，推荐使用
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample7 {
    private SingletonExample7() {

    }

    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExample7 singleton;

        //jvm保证这个方法绝对只调用一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singleton;
        }


    }
}
