package com.github.greekpanda.interpreter;

import java.util.HashMap;

/**
 * 变量解析器，key在表达式中的a+b-c中的值
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:53
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /*
    * 根据变量完成表达式的值
    * */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(key);
    }
}
