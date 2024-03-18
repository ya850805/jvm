package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/18 17:36
 **/
public class StringTest {
    public static void main(String[] args) {
        //這邊不會找自定義的String，因為雙親委派機制，是由Bootstrap ClassLoader來負責加載核心類的那個String
        String str = new String();
        System.out.println("hello");

        StringTest test = new StringTest();
        System.out.println(test.getClass().getClassLoader()); //sun.misc.Launcher$AppClassLoader@18b4aac2
    }
}
