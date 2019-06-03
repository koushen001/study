package com.cike.java8.dm;

/**
 * @Description Java 8 新增了接口的默认方法。
 * <p>
 * 简单说，默认方法就是接口可以有实现方法，而且不需要实现类去实现其方法。
 * <p>
 * 我们只需在方法名前面加个 default 关键字即可实现默认方法。
 * @Author kou
 * @Version 1.0
 **/
public class DefaultMethodExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}
