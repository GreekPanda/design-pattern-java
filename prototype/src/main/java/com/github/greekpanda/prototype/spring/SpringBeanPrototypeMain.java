package com.github.greekpanda.prototype.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 07:41
 */
public class SpringBeanPrototypeMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object bean = applicationContext.getBean("id01");
        Object bean2 = applicationContext.getBean("id01");
        System.out.println(bean + " hashcode: " + bean.hashCode());
        System.out.println(bean2 + " hashcode :" + bean2.hashCode());
        System.out.println(bean == bean2);
    }
}
