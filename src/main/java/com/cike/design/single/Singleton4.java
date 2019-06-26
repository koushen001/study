package com.cike.design.single;

/**
 * @Description 内部类
 * @Author kou
 * @Version 1.0
 **/
public class Singleton4 {

    /**
     * 限制产生多个对象
     */
    private Singleton4() {

    }

    /**
     * 通过该方法获得实例对象
     *
     * @return
     */
    public static Singleton4 getInstance() {
        return SingletonHolder.singleton;
    }

    /**
     * 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载
     */
    private static class SingletonHolder {
        //静态初始化，由jvm来保证线程安全
        private static Singleton4 singleton = new Singleton4();
    }

}
