package com.cike.immutable;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;

/**
 * @Description 不可变对象，线程安全
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class ImmutableExample3 {

    private final static ImmutableList<Integer> list = ImmutableList.of(1, 2, 3);

    private final static ImmutableSet set = ImmutableSet.copyOf(list);

    private final static ImmutableMap<Integer, Integer> map = ImmutableMap.of(1, 2, 3, 4);
    private final static ImmutableMap<Integer, Integer> map2 = ImmutableMap.<Integer, Integer>builder().put(1, 2)
            .put(3, 4).put(4, 5).build();

    public static void main(String[] args) {
        list.add(4);
        set.add(4);
        map.put(1, 4);
        map2.put(1, 4);
    }
}
