package com.github.greekpanda.interpreter;

import java.util.HashMap;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 15:44
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
