package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/18 17:29
 **/
public class GetClassLoaderTest {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.
        ClassLoader classLoader = Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader); //null

        //2.
        ClassLoader classLoader1 = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader1); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //3.
        ClassLoader classLoader2 = ClassLoader.getSystemClassLoader().getParent();
        System.out.println(classLoader2); //sun.misc.Launcher$ExtClassLoader@1540e19d
    }
}
