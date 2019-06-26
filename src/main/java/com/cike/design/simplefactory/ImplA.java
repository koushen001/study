package com.cike.design.simplefactory;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class ImplA implements Api {
    @Override
    public void operation(String s) {
        System.out.println("ImplA s=" + s);
    }
}
