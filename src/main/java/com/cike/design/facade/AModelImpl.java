package com.cike.design.facade;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class AModelImpl implements AModelApi{
    @Override
    public void testA() {
        System.out.println("现在在A模块里面操作testA方法");
    }
}
