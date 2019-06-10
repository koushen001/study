package com.cike.java8.func;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Description
 * @Author kou
 * @Version 1.0
 **/
public class FunctionalInterfaceExample2 {
    public static void main(String args[]) throws IOException {
        //打印一行
        String result = processFile((BufferedReader r) -> r.readLine());
        System.out.println(result);

        //打印2行
        result = processFile((BufferedReader r) -> r.readLine() + r.readLine());
        System.out.println(result);
    }

    public static String processFile(BufferedReaderProcessor processor) throws IOException {

        try (BufferedReader reader = new BufferedReader(new FileReader("D:/test/data.txt"))) {
            //处理 BufferedReader 对象
            return processor.process(reader);
        }
    }
}
