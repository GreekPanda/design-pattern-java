package com.github.greekpanda.springmvc;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:11
 */
public interface Controller {
}

class HttpController implements Controller {
    public void doHttpController() {
        System.out.println("doHttpController");
    }
}

class SimpleController implements Controller {
    public void doSimpleController() {
        System.out.println("doSimpleController");
    }
}

class AnnotationController implements Controller {
    public void doAnnotationController() {
        System.out.println("doAnnotationController");
    }
}
