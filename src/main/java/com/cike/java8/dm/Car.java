package com.cike.java8.dm;

/**
 * @Description TODO
 * @Author kou
 * @Version 1.0
 **/
public class Car implements Vehicle, FourWheeler {
    @Override
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}
