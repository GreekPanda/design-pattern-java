package com.github.greekpanda.interpreter;

import java.util.HashMap;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 15:37
 */
public class AddExpression extends SymbolExpression{
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /*
    * 处理相加，在栈中使用了加法的操作符
    * */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
