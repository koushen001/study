package com.cike.day02.singleton;

/**
 * @Description 懒汉模式，不推荐写法
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample3 {
    private SingletonExample3(){

    }
    private static SingletonExample3 instance = null;

    public static synchronized SingletonExample3 getInstance(){
        if (instance==null){
            instance = new SingletonExample3();
        }
        return instance;
    }
}
