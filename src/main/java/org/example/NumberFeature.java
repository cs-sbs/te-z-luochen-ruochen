package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑

// 从个位开始遍历数字的每一位
        int numberCopy = inputNumber; // 复制输入数字，用于遍历，避免改变原始输入
        int position = 1; // 数位，从1开始（个位是1号）

        while (numberCopy > 0) {
            int digit = numberCopy % 10; // 获取当前最低位的数字
            boolean digitIsOdd = (digit % 2) != 0; // 判断数字是否为奇数
            boolean positionIsOdd = (position % 2) != 0; // 判断数位是否为奇数

            // 如果数字和数位的奇偶性相同，则结果加上当前位的位值
            if (digitIsOdd == positionIsOdd)
            {

                result += 1 << (position - 1); // 累加对应的位值（2的(position-1)次幂）
            }

            numberCopy /= 10; // 去掉当前最低位，继续处理下一位
            position++; // 数位加1
        }


        //result = inputNumber;

        System.out.println(result);
    }
}
