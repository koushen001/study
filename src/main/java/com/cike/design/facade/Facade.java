package com.cike.design.facade;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class Facade {
    public void test() {
        AModelApi a = new AModelImpl();
        a.testA();
        BModelApi b = new BModelImpl();
        b.testB();
        CModelApi c = new CModelImpl();
        c.testC();
    }
}
