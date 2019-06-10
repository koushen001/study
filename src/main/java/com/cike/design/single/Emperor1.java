package com.cike.design.single;

/**
 * @Description 皇帝类
 * @Author kou
 * @Version 1.0
 **/
public class Emperor1 {
    private static final Emperor1 EMPEROR_1 = new Emperor1();

    private Emperor1() {
    }

    public static Emperor1 getInstance() {
        return EMPEROR_1;
    }

    public static void say() {
        System.out.println("我就是皇帝某某某...");
    }
}
