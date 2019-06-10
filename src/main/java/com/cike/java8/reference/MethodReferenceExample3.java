package com.cike.java8.reference;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class MethodReferenceExample3 {
    public static void main(String[] args) {
        //lambda
        Consumer<String> consumer1 = x -> System.out.println(x);
        //对象引用::实例方法名
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("This is Major Tom");
        //类名::静态方法名
        Function<Long, Long> f1 = x -> Math.abs(x);
        Function<Long, Long> f2 = Math::abs;
        Long result = f2.apply(-3L);
        System.out.println(result);
        //类名::实例方法名
        BiPredicate<String, String> b1 = (x, y) -> x.equals(y);
        BiPredicate<String, String> b2 = String::equals;
        boolean result2 = b2.test("abc", "abcd");
        System.out.println(result2);
        //引用构造器
        Function<Integer, StringBuffer> fun1 = n -> new StringBuffer(n);
        Function<Integer, StringBuffer> fun2 = StringBuffer::new;
        StringBuffer buffer = fun2.apply(10);
        //引用数组
        Function<Integer, int[]> fun4 = n -> new int[n];
        Function<Integer, int[]> fun = int[]::new;
        int[] arr = fun.apply(10);

        Function<Integer, Integer[]> fun3 = Integer[]::new;
        Integer[] arr2 = fun3.apply(10);

    }
}
