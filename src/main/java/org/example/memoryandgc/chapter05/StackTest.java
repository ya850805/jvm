package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/21 15:52
 **/
public class StackTest {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        stackTest.methodA();
    }

    public void methodA() {
        int i = 10;
        int j = 20;

        methodB();
    }

    public void methodB() {
        int k = 30;
        int m = 40;
    }
}
