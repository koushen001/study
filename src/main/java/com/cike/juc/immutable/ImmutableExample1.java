package com.cike.juc.immutable;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * @Description TODO
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class ImmutableExample1 {
    private final static Integer a = 1;
    private final static String b = "2";
    private final static Map<Integer, Integer> map = Maps.newHashMap();

    static {
        map.put(1, 2);
        map.put(3, 4);
        map.put(5, 6);
    }

    public static void main(String[] args) {
        //a = 2;
        //b = "3";
        map.put(1, 3);
        log.info("{}", map.get(1));
    }
}
