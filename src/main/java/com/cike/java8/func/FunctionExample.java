package com.cike.java8.func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @Description java.util.function.Function<T, R>接口定义了一个叫作apply的方法，它接受一个泛型 T 的对象，并返回一个泛型 R 的对象。
 * 如果你需要定义一个Lambda，将输入对象的信息映射到输出，就可以使用这个接口（比如提取苹果的重量，或把字符串映射为它的长度）。
 * 在下面的代码中，我们向你展示如何利用它来创建一个map方法，以将一个String列表映射到包含每个 String长度的Integer列表。
 * @Author kou
 * @Version 1.0
 **/
public class FunctionExample {

    public static void main(String[] args) {
        List<Integer> list = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
        System.out.println(list);
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {

        List<R> result = new ArrayList<>();

        for (T s : list) {
            result.add(f.apply(s));
        }
        return result;
    }

}
