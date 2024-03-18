package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/18 15:55
 **/
public class ClassLoaderTest {
    public static void main(String[] args) {
        //獲取系統類加載器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //獲取其上層：擴展類加載器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader); //sun.misc.Launcher$ExtClassLoader@1540e19d

        //獲取其上層：獲取不到BootstrapClassLoader
        ClassLoader bootstrapClassLoader = extClassLoader.getParent();
        System.out.println(bootstrapClassLoader); //null

        //對於用戶自定義類：默認使用系統類加載器進行加載
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader); //sun.misc.Launcher$AppClassLoader@18b4aac2

        //String類使用引導類加載器BootstrapClassLoader進行加載的 ---> Java的核心類庫都是使用引導類加載器進行加載的
        ClassLoader classLoader1 = String.class.getClassLoader();
        System.out.println(classLoader1); //null
    }
}
