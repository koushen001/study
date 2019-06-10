package com.cike.java8.func;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @Description 函数式接口传递行为
 * @Author kou
 * @Version 1.0
 **/
@FunctionalInterface
public interface BufferedReaderProcessor {
    String process(BufferedReader reader) throws IOException;
}
