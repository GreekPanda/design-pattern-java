package com.github.greekpanda.interpreter;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 15:48
 */
public class Calculator {
    private Expression expression;

    public Calculator(String exStr) {
        Stack<Expression> stack = new Stack<>();

        char[] charArray = exStr.toCharArray();


        Expression left  = null;
        Expression right = null;

        for(int i = 0; i < charArray.length; i++) {
            switch (charArray[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(charArray[i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(charArray[i])));
                    break;
            }
        }
        this.expression = stack.pop();

    }

    public int run(HashMap<String, Integer> val) {
        return this.expression.interpreter(val);
    }
}
