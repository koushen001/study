package com.cike.design.single;

/**
 * 枚举单例模式
 */
public enum SingletonDemo5 {
    /**
     * 这个枚举元素，本身就是单例
     */
    INSTANCE;

    public void operation() {
        System.out.println("其他操作");
    }

}
