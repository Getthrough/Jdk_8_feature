package com.getthrough.features.lambda;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Runnable 接口方法使用 lambda 实现
 *
 * @author getthrough
 * @date 2019/3/17
 */
public class RunnableInLambda {

    public static void main(String[] args) {
        // lambda 表达式的方法实现只有一行语句时，可以直接写语句而无需大括号包围
        new Thread(() -> System.out.println("use Runnable in Lambda!")).start();

        // lambda 表达式可以理解为一个匿名内部类，作为一个变量指向的对象
        Runnable r = () -> System.out.println("I am a task runner!");
        new Thread(r).start();

        // 实现的方法有多个语句，使用大括号包围
        Runnable r2 = () -> {
            System.out.println("Hi, I am the first sentence!");
            System.out.println("Hi, I am the second sentence!");
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(r2);

        // 用 lambda 实现自定义函数接口方法
        MyFunctionalInterface mfi = (int x, int y) -> x + y;
        System.out.println(mfi.twoSum(2, 3));

    }




}