package com.cike.design.single;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class Emperor2 {
    //定义最多能产生的实例数量
    private static int maxNumOfEmperor = 2;
    //每个皇帝都有名字，使用一个ArrayList来容纳，每个对象的私有属性
    private static List<String> nameList = new ArrayList<>();
    //定义一个列表，容纳所有的皇帝实例
    private static List<Emperor2> emperor2List = new ArrayList<>();
    //当前皇帝序列号
    private static int countNumOfEmperor = 0;

    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperor2List.add(new Emperor2("皇" + (i + 1) + "帝"));
        }
    }

    private Emperor2() {

    }

    private Emperor2(String name) {
        nameList.add(name);
    }

    //随机获取一个皇帝对象
    public static Emperor2 getInstance() {
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperor2List.get(countNumOfEmperor);
    }

    //皇帝发话了
    public static void say() {
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
