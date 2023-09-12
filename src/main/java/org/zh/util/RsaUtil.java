package org.zh.util;

import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.util.Scanner;

public class RsaUtil {
    public static String encryptStringRsa(String data, String privateKey, String publicKey) {
        RSA rsa = new RSA(privateKey, publicKey);
        String result = rsa.encryptBase64(data, KeyType.PublicKey);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入待加密字符串：");
        String data = scanner.nextLine();
        System.out.print("输入私钥：");
        String privateKey = scanner.nextLine();
        System.out.print("输入公钥：");
        String publicKey = scanner.nextLine();
        System.out.println(encryptStringRsa(data, privateKey, publicKey));
    }
}
