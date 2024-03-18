package org.example.memoryandgc.chapter02;

import sun.misc.Launcher;
import sun.security.ec.SunEC;

import java.net.URL;
import java.security.Provider;

/**
 * @author jason
 * @description
 * @create 2024/3/18 16:16
 **/
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        System.out.println("=====啟動類加載器=====");
        //獲取BootstrapClassLoader能夠加載的API的路徑
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urLs) {
            System.out.println(url.toExternalForm());
        }
        //從上面的路徑中任選一個類，看看他的類加載器是什麼
        ClassLoader classLoader = Provider.class.getClassLoader();
        System.out.println(classLoader); //null ---> 引導類加載器

        /*****************************************************************************/

        System.out.println("=====擴展類加載器=====");
        String extDirs = System.getProperty("java.ext.dirs");
        for (String path : extDirs.split(":")) {
            System.out.println(path);
        }
        ClassLoader classLoader1 = SunEC.class.getClassLoader();
        System.out.println(classLoader1); //sun.misc.Launcher$ExtClassLoader@2f2c9b19
    }
}
