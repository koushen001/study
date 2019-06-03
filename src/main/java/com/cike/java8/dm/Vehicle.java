package com.cike.java8.dm;

/**
 * @Description TODO
 * @Author kou
 * @Version 1.0
 **/
public interface Vehicle {

    default void print() {
        System.out.println("我是一辆车!");
    }
    // 静态方法
    static void blowHorn() {
        System.out.println("按喇叭!!!");
    }
}
