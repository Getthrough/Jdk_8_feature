package com.getthrough.features.lambda;

/**
 * 自定义函数式接口，该接口中只能包含一个抽象方法
 *
 * @author getthrough
 * @date 2019/3/17
 */
// 只是一个提示类型（informative）的一个接口，函数式接口并不要求必须加上该注释
// 一个类添加了该注释，编译器最好检查该类是否满足函数式接口的要求
@FunctionalInterface
public interface MyFunctionalInterface {

    Integer twoSum(int x, int y);

    // 不能有两个抽象方法，因为在使用 lambda 表达式时只能实现一个抽象方法
    // public abstract String getHashCode(Object obj);

}
