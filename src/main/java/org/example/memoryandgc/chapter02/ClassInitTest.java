package org.example.memoryandgc.chapter02;

/**
 * @author jason
 * @description
 * @create 2024/3/17 17:02
 **/
public class ClassInitTest {
    private static int num = 1; //有static才有<clinit>()方法

    static {
        num = 2;
        number = 20;

        System.out.println(num);
//        System.out.println(number); //報錯，number後面才聲明
    }

    /**
     * linking階段之prepare: number = 0
     * initial初始化階段: 20 ----> 10
     */
    private static int number = 10;

    public static void main(String[] args) {
        System.out.println(ClassInitTest.num);
        System.out.println(ClassInitTest.number);
    }

    //構造函數對應的是<init>()方法
    public ClassInitTest() {
        int x = 11;
    }
}
