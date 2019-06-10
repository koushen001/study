package com.cike.java8.reference;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @Description 方法引用可以被看作仅仅调用特定方法的Lambda的一种快捷写法。
 * 它的基本思想是，如果一个Lambda代表的只是“直接调用这个方法”，那最好还是用名称来调用它，而不是去描述如何调用它。
 * 事实上，方法引用就是让你根据已有的方法实现来创建 Lambda表达式。
 * 但是，显式地指明方法的名称，你的代码的可读性会更好。
 * 它是如何工作的呢？ 当你需要使用方法引用时,
 * 目标引用放在分隔符 :: 前， 方法的名称放在后面。
 * 例如， Apple::getWeight就是引用了Apple类中定义的方法getWeight。
 * 请记住，不需要括号，因为 你没有实际调用这个方法。
 * 方法引用就是Lambda表达式(Apple a) -> a.getWeight()的快捷写法，下表给出了Java 8中方法引用的其他一些例子。
 * Lambda	                                                等效的引用方法
 * (Apple a) -> a.getWeight()	                            Apple::getWeight
 * () -> Thread.currentThread().dumpStack()	                Thread.currentThread()::dumpStack
 * (str,i) -> str.substring(i)	                            String::substring
 * (String i) -> System.out.println(s)	                    System.out::println
 * @Author kou
 * @Version 1.0
 **/
public class MethodReferenceExample1 {
    public static void main(String[] args) {
        //假设有一个构造函数没有参数。 它适合 Supplier 的签名
        Supplier<Apple> supplier1 = Apple::new;
        Apple apple1 = supplier1.get();

        Supplier<Apple> supplier2 = () -> new Apple();
        Apple apple2 = supplier2.get();
        //如果你的构造函数的签名是Apple(Integer weight)，那么它就适合 Function 接口的签名
        Function<Integer, Apple> function1 = Apple::new;
        Apple apple3 = function1.apply(100);
        //等价于：
        Function<Integer, Apple> function2 = (Integer weight) -> new Apple(weight);
        Apple apple4 = function2.apply(100);

    }
}
