package com.github.greekpanda.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式，可以获取各种变量的表达式
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:49
 */
public abstract class Expression {
    //解释变量和数值，key是表达式，参数[a, b, c], var是具体的数字
    public abstract int interpreter(HashMap<String, Integer> var);
}
