package com.github.greekpanda.flyweight;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 17:23
 */
public class FlyweightMain {
    public static void main(String[] args) {
        //Create factory website
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite webSite = webSiteFactory.getWebSiteCategory("news");
        webSite.use(new User("tom"));

        //blog
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("blog");
        webSite1.use(new User("jack"));

        WebSite webSite11 = webSiteFactory.getWebSiteCategory("blog");
        webSite11.use(new User("charlie"));

        WebSite webSite12 = webSiteFactory.getWebSiteCategory("blog");
        webSite12.use(new User("Tylor"));

        //wx public account
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("wxPublic");
        webSite2.use(new User("Tony"));

        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
