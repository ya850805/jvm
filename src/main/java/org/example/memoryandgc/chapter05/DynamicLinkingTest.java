package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/26 15:09
 **/
public class DynamicLinkingTest {
    int num = 10;

    public void methodA() {
        System.out.println("methodA()...");
    }

    public void methodB() {
        System.out.println("methodB()...");

        methodA();

        num++;
    }
}
