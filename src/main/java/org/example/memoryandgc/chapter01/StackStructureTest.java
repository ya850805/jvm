package org.example.memoryandgc.chapter01;

/**
 * @author jason
 * @description
 * @create 2024/3/14 18:02
 *
 *  javap -v StackStructureTest
 **/
public class StackStructureTest {
    public static void main(String[] args) {
//        int i = 2 + 3;

        int i = 2;
        int j = 3;
        int k = i + j;
    }
}
