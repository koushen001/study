package com.cike.java8.reference;

import java.util.Comparator;

/**
 * @Description TODO
 * @Author kou
 * @Version 1.0
 **/
public class AppleComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
