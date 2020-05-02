package com.github.greekpanda.flyweight;

import java.util.HashMap;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/3 06:47
 */
public class WebSiteFactory {
    private HashMap<String, ConcreteWebSite> pool = new HashMap<>();

    // according website type, return a website, if none, then create it and put it into pool
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    //get count of website
    public int getWebSiteCount() {
        return pool.size();
    }
}
