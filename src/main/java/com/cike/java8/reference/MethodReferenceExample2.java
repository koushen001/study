package com.cike.java8.reference;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class MethodReferenceExample2 {
    public static void main(String[] args) {
        ArrayList<Apple> apples = Lists.newArrayList(new Apple(100), new Apple(150), new Apple(50));
        System.out.println(apples);
        //传递代码
        apples.sort(new AppleComparator());
        System.out.println(apples);
        //使用匿名类
        apples.sort(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
        //使用 Lambda 表达式
        apples.sort((Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
        //使用方法引用
        apples.sort(Comparator.comparing(Apple::getWeight));
    }
}
