package com.cike.design.single;

/**
 * @Description 臣子类
 * @Author kou
 * @Version 1.0
 **/
public class Minister1 {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor1 emperor1 = Emperor1.getInstance();
            emperor1.say();
        }
    }
}
