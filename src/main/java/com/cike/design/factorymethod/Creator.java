package com.cike.design.factorymethod;

/**
 * @Description 创建器，声明工厂方法
 * @Author kou
 * @Version 1.0
 **/
public abstract class Creator {
    /**
     * 创建product的工厂方法
     * @return
     */
    protected abstract Product factoryMethod();

    public void someOperation(){

    }
}
