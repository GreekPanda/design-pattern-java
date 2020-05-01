package com.github.greekpanda.springmvc;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:15
 */
public interface HandlerAdapter {
    boolean supports(Object handler);
    void handle(Object handler);
}


class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController) handler).doHttpController();
    }
}

class SimpleHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController) handler).doSimpleController();
    }
}

class AnnotationHandlerAdapter implements  HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController) handler).doAnnotationController();
    }
}

