package com.cike.design.simplefactory;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        Api api = Factory.createApi(1);
        api.operation("正在使用简单工厂");
    }
}
