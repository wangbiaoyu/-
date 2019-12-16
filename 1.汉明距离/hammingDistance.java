package com.youzhang.code;


/**
 * @ClassName: hammingDistance
 * @author: youzhang
 * @date: 2019/12/16  23:05
 */
public class hammingDistance {
    public static void main(String[] args) {

        // 位运算
        int code = hammingDistance1(333, 9999);
        System.out.println(code);

        // 转32位 比较
        int code1 = hammingDistance2(333, 9999);
        System.out.println(code1);

    }

    /*
     *  位运算
     */

    public static int hammingDistance1(int x, int y) {
        int xor = x ^ y;
        int count = 0;
        while (xor != 0) {
            xor = xor & (xor - 1);
            count++;
        }
        return count;
    }

    /*
     *  转32位 比较
     */
    public static int hammingDistance2(int i, int bitNum) {
        String binaryStr = Integer.toBinaryString(i);
        while (binaryStr.length() < 32) {
            binaryStr = "0" + binaryStr;
        }
        String binaryEnd = Integer.toBinaryString(bitNum);
        while (binaryEnd.length() < 32) {
            binaryEnd = "0" + binaryEnd;
        }
        int count = 0;
        for (int j = 0; j < 32; j++) {
            if (!binaryStr.substring(j, j + 1).equals(binaryEnd.substring(j, j + 1))) {
                count++;
            }
        }
        return count;
    }
}
