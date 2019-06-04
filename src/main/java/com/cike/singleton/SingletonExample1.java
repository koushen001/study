package com.cike.singleton;

/**
 * @Description 懒汉模式，线程不安全
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample1 {
    private SingletonExample1(){

    }
    private static SingletonExample1 instance = null;

    public static SingletonExample1 getInstance(){
        if (instance==null){
            instance = new SingletonExample1();
        }
        return instance;
    }
}
