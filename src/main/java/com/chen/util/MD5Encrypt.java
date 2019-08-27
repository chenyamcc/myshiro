package com.chen.util;

import lombok.SneakyThrows;

import java.security.MessageDigest;
import java.util.Base64;

/**
 * @author Carl
 * @title: MD5Encrypt
 * @description: MD5加密
 * @date 2019/8/22 19:50
 */
public class MD5Encrypt {
    private static final int num =1024;
    public static String getPassWord(String text) throws Exception {
        for (int i = 0; i < num; i++) {
            text = encrypt(text);
        }
        return text;
    }

    private static String encrypt(String text) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(text.getBytes());
        byte[] digest = messageDigest.digest();
        return Base64.getEncoder().encodeToString(digest);
    }
}
