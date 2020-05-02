package com.github.greekpanda.io;

import java.io.*;

/**
 * @author GreePanda
 * @version 1.0
 * @date 2020/5/2 15:17
 */
public class IOMain {
    public static void main(String[] args) throws IOException {
        //InputStream is abstract, it's like drink
        //FileInputStream is like coffee or longback is specific class
        //FilterInputStream is subclass of inputstream like decorator
        //DataInputStream is specific of decorator like mile or chocolate
        //FilterInputStream has attribute of "volatile inputstream"
        //JDK's io hierachy like decorator
        DataInputStream dis = new DataInputStream(new FileInputStream("./test.txt"));
        System.out.println(dis.read());
        dis.close();
    }
}
