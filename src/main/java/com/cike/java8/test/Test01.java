package com.cike.java8.test;

/**
 * @Author Kou
 * @Date 2020/5/27
 * @Version 1.0
 **/
public class Test01 {
    public static void main(String[] args) {
        new B();
    }
}
class A{
    static {
        System.out.println("static A");
    }
    public A(){
        System.out.println("structure A");
    }
}
class B extends A{
    static {
        System.out.println("static B");
    }

    public B() {
        System.out.println("structure B");
    }
}