package com.cike.day02.singleton;

/**
 * @Description 静态代码块执行顺序
 * @Author CIKE
 * @Version 1.0
 **/
public class SingletonExample6 {
    private SingletonExample6() {

    }

    static {
        instance = new SingletonExample6();
    }

    //volatile限制jvm和cpu优化发生指令重排
    private static volatile SingletonExample6 instance = null;

    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
