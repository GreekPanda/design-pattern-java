package com.github.greekpanda.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/1 15:22
 */
public class DispatchServlet {
    private static List<HandlerAdapter> handlerAdapterList  = new ArrayList<>();

    public DispatchServlet() {
        handlerAdapterList.add(new HttpHandlerAdapter());
        handlerAdapterList.add(new SimpleHandlerAdapter());
        handlerAdapterList.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch() {
        AnnotationController controller = new AnnotationController();
        HandlerAdapter adapter = getHandler(controller);
        adapter.handle(controller);
    }

    private HandlerAdapter getHandler(Controller controller) {

        for(HandlerAdapter h : this.handlerAdapterList) {
            if(h.supports(controller))
                return h;
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
