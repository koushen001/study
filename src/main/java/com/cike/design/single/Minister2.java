package com.cike.design.single;

/**
 * @Description 臣子类
 * @Author kou
 * @Version 1.0
 **/
public class Minister2 {
    public static void main(String[] args) {
        int minsterNum = 5;
        for (int i = 0; i < minsterNum; i++) {
            Emperor2 instance = Emperor2.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            instance.say();
        }
    }
}
