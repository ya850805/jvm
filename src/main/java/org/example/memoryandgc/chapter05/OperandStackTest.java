package org.example.memoryandgc.chapter05;

/**
 * @author jason
 * @description
 * @create 2024/3/25 16:38
 **/
public class OperandStackTest {
    public void testAddOperation() {
        byte i = 15;
        int j = 8;
        int k = i + j;

        int m = 800;
    }

    public int getSum() {
        int m = 10;
        int n = 20;
        int k = m + n;
        return k;
    }

    public void testGetSum() {
        //獲取上一個棧幀返回的結果，並保存在操作數棧中
        int i = getSum();
        int j = 10;
    }
}
