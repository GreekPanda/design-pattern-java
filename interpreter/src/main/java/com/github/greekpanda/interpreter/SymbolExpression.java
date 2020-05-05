package com.github.greekpanda.interpreter;

import java.util.HashMap;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 15:38
 */
public class SymbolExpression extends Expression{
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }


    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return 0;
    }
}
