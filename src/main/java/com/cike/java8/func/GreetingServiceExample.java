package com.cike.java8.func;

/**
 * @Description http://www.runoob.com/java/java8-functional-interfaces.html
 * JDK 8之前已有的函数式接口
 * java.lang.Runnable
 * java.util.concurrent.Callable
 * java.security.PrivilegedAction
 * java.util.Comparator
 * java.io.FileFilter
 * java.nio.file.PathMatcher
 * java.lang.reflect.InvocationHandler
 * java.beans.PropertyChangeListener
 * java.awt.event.ActionListener
 * javax.swing.event.ChangeListener
 *
 * 新定义的函数式接口
 * java.util.function中定义了几组类型的函数式接口以及针对基本数据类型的子接口。
 * Predicate -- 传入一个参数，返回一个bool结果， 方法为boolean test(T t)
 * Consumer -- 传入一个参数，无返回值，纯消费。 方法为void accept(T t)
 * Function -- 传入一个参数，返回一个结果，方法为R apply(T t)
 * Supplier -- 无参数传入，返回一个结果，方法为T get()
 * UnaryOperator -- 一元操作符， 继承Function,传入参数的类型和返回类型相同。
 * BinaryOperator -- 二元操作符， 传入的两个参数的类型和返回类型相同， 继承BiFunction
 *
 * @Author kou
 * @Version 1.0
 **/
public class GreetingServiceExample {
    public static void main(String[] args) {
        GreetingService greetingService = message -> System.out.println("Hello " + message);
        greetingService.sayMessage("test");
    }
}
