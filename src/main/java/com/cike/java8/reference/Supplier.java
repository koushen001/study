package com.cike.java8.reference;

/**
 * @Description TODO
 * @Author kou
 * @Version 1.0
 **/
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
