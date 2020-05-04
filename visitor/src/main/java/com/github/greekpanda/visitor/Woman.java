package com.github.greekpanda.visitor;

/**1. 类中使用了双分派，即在客户端程序中将具体的状态作为参数传入,这是第一次分派
 * 2. women类中，调用了作为参数的具体方法,同时将自己的this作为参数传入，完成了第二次分派
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/4 08:05
 */
public class Woman extends Person {
    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }
}
