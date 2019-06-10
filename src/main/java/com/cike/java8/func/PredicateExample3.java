package com.cike.java8.func;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @Description Predicate <T> 接口是一个函数式接口，它接受一个输入参数 T，返回一个布尔值结果。
 * 该接口包含多种默认方法来将Predicate组合成其他复杂的逻辑（比如：与，或，非）。
 * 该接口用于测试对象是 true 或 false。
 * 在你需要表示一个涉及类型T的布尔表达式时，就可以使用这个接口
 * @Author kou
 * @Version 1.0
 **/
public class PredicateExample3 {
    public static void main(String args[]) {
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        ArrayList<String> list = Lists.newArrayList("1", "2", "3", "");
        System.out.println(list);
        List<String> nonEmpty = filter(list, nonEmptyStringPredicate);
        System.out.println(nonEmpty);
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> p) {

        List<T> results = new ArrayList<>();
        for (T s : list) {
            if (p.test(s)) {
                results.add(s);
            }
        }
        return results;
    }
}
