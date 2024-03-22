package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/22 15:45
 *
 *  方法的結束方式分為2種：
 *      1. 正常結束，以return為代表
 *      2. 方法中出現未捕獲處理的異常，以拋出異常的方式結束
 **/
public class StackFrameTest {
    public static void main(String[] args) {
        StackFrameTest stackFrameTest = new StackFrameTest();
        stackFrameTest.method1();
    }

    public void method1() {
        System.out.println("method1開始執行");
        method2();
        System.out.println("method1執行結束");
    }

    public int method2() {
        System.out.println("method2開始執行");
        int i = 10;
        int m = (int) method3();
        System.out.println("method2即將結束..");
        return i + m;
    }

    public double method3() {
        System.out.println("method3開始執行");
        double j = 20.0;
        System.out.println("method3執行結束");
        return j;
    }
}
