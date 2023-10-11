package org.zh.util;

import cn.hutool.crypto.digest.MD5;

import java.util.Scanner;

public class Md5Util {
    public static String md5(String str) {
        return MD5.create().digestHex(str);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入待md5数据：");
        String data = scanner.nextLine();
        System.out.println(md5(data));
    }
}
