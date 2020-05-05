package com.github.greekpanda.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/5 11:44
 */
public class InterpreterMain {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("当前运算结果: " + expStr + "=" + calculator.run(var));

    }

    public static String getExpStr() throws IOException {
        System.out.println("输入表达式");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getValue(String expStr) {
        HashMap<String, Integer> map = new HashMap<>();
        for(Character c : expStr.toCharArray()) {
            if(c != '+' && c != '-') {

            }
        }
        return map;
    }
}
