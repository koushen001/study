package com.cike.design.single;

/**
 * 饿汉式单例模式
 */
public class SingletonDemo2 {
    /**
     * 类初始化时，延迟加载这个对象
     */
    private static SingletonDemo2 instance;

    private SingletonDemo2(){

    }

    public static synchronized SingletonDemo2 getInstance(){
        if (instance==null){
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
