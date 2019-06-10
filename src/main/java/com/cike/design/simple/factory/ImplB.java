package com.cike.design.simple.factory;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class ImplB implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplB s=" + s);
    }
}
