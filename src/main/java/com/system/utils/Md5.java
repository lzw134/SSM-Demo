package com.system.utils;


import org.apache.commons.codec.digest.DigestUtils;

public class Md5 {
    public final static String md5key = "AKAKAK474747";

    /**
     * MD5方法
     *
     * @param text 明文 123456
     * @return 密文
     * @throws Exception
     */
    public static String md5(String text) throws Exception {
        //加密后的字符串
        String encodeStr = DigestUtils.md5Hex(text + md5key);
        return encodeStr;
    }

    /**
     * MD5验证方法
     *
     * @param text 明文
     * @param key  密钥
     * @param md5  密文
     * @return true/false
     * @throws Exception
     */
    public static boolean verify(String text, String key, String md5) throws Exception {
        //根据传入的密钥进行验证
        String md5Text = md5(text);
        if (md5Text.equalsIgnoreCase(md5)) {
            System.out.println("MD5验证通过");
            return true;
        }
        return false;
    }
}
