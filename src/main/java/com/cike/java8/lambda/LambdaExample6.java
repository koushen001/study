package com.cike.java8.lambda;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 使用局部变量
 * Lambda可以没有限制地捕获（也就是在其主体中引用）实例变量和静态变量。
 * 但局部变量必须显式声明为final， 或事实上是final。
 * 换句话说，Lambda表达式只能捕获指派给它们的局部变量一次。
 * 为什么局部变量有这些限制？
 * 第一，实例变量和局部变量背后的实现有一 个关键不同。
 * 实例变量都存储在堆中，而局部变量则保存在栈上。
 * 如果Lambda可以直接访问局部变量，而且Lambda是在一个线程中使用的，则使用Lambda的线程，可能会在分配该变量的线程将这个变量收回之后，去访问该变量。
 * 因此，Java在访问自由局部变量时，实际上是在访问它的副本，而不是访问原始变量。
 * 如果局部变量仅仅赋值一次那就没有什么区别了——因此就有了这个限制。
 * 第二，这一限制不鼓励你使用改变外部变量的典型命令式编程模式（这种模式会阻碍很容易做到的并行处理）。
 * @Author kou
 * @Version 1.0
 **/
@Slf4j
public class LambdaExample6 {
    public static void main(String[] args) {
        int portNumber = 1337;
        Runnable r = () -> System.out.println(portNumber);
        //错误：Lambda表达式引用的局 部变量必须是最终的（final） 或事实上最终的
//        portNumber = 31337;

    }
}
