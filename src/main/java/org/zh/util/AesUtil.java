package org.zh.util;

import cn.hutool.crypto.symmetric.AES;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class AesUtil {
    public static String encryptStringAes(String data, String aesKey) {
        AES aes = new AES(aesKey.getBytes(StandardCharsets.UTF_8));
        String result = aes.encryptHex(data);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入待加密数据：");
        String data = scanner.nextLine();
        System.out.print("输入aes密钥：");
        String aesKey = scanner.nextLine();
        System.out.println(encryptStringAes(data, aesKey));
    }
}
