package com.cike.design.single;

/**
 * @Description 双重检测锁单例模式
 * @Author kou
 * @Version 1.0
 **/
public class Singleton3 {

    private volatile static Singleton3 SINGLETON = null;

    /**
     * 限制产生多个对象
     */
    private Singleton3() {

    }

    /**
     * 通过该方法获得实例对象
     *
     * @return
     */
    public static Singleton3 getInstance() {
        if (SINGLETON == null) {
            synchronized (Singleton3.class) {
                if (SINGLETON == null) {
                    SINGLETON = new Singleton3();
                }
            }
        }
        return SINGLETON;
    }

}
