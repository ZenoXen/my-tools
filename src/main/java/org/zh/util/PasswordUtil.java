package org.zh.util;

import cn.hutool.core.util.RandomUtil;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Scanner;

public class PasswordUtil {


    public static String generateBCryptPassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encoded = encoder.encode(password);
        return encoded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入原始密码：");
        String str = scanner.nextLine();
        if ("random".equals(str)) {
            str = RandomUtil.randomString(10);
            System.out.println("随机密码" + str);
        }
        System.out.println(generateBCryptPassword(str));
    }

}
