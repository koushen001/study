package com.cike.java8.interfaces;

/**
 * @Description 接口中的默认方法
 * @Author kou
 * @Version 1.0
 **/
public interface DefaultExample {
    /**
     * 默认方法
     *
     * @return
     */
    default String test() {
        return "test default method";
    }

}