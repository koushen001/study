package com.cike.publish;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 对象溢出，一种错误的发布，当一个对象还没有构造完成时，就使它被其他线程所见
 * @Author CIKE
 * @Version 1.0
 **/
@Slf4j
public class Escape {
    private int thisCanBeEscape = 0;

    public Escape() {
        new InnerClass();
    }

    private class InnerClass {
        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }
}
