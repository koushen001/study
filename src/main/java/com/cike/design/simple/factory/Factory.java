package com.cike.design.simple.factory;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class Factory {
    public static Api createApi(int condition) {
        Api api = null;
        if (condition == 1) {
            api = new ImplA();
        } else if (condition == 2) {
            api = new ImplB();
        }
        return api;
    }
}
