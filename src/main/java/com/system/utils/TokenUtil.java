package com.system.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Date;

/**
 * Token工具类
 * @author : Bei-Zhen
 * @date : 2020-12-26 8:58
 */
public class TokenUtil {

    /**
     * 有效时长
     */
    private static final long EXPIRE_TIME = 24 * 60 * 60 * 1000;
    /**
     * 密钥
     */
    private static final String TOKEN_SECRET = "ben";

    /**
     * 签名生成
     * @param u_id
     * @return
     */
    public static String sign(int u_id){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth") //
                    .withClaim("u_id",u_id)
                    .withExpiresAt(expiresAt)
                    //使用HMAC256算法加密
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;
    }

    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256((TOKEN_SECRET)))
                    .withIssuer("auth").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过");
            System.out.println("u_id" +jwt.getClaim("u_id").asString());
            System.out.println("过期时间：" + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }
    }
    public static void main(String[] args) {
          /*一定要学会使用main函数进行测试*/
          /*这里花费了2个小时。结果是moven包冲突了*/
          /*
          * <dependency>
          *<groupId>commons-codec</groupId>
          *<artifactId>commons-codec</artifactId>
          *<version>1.3</version>
          *</dependency>
          * */
          boolean a = verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1X2lkIjoi5L2g5aW95ZCXIiwiaXNzIjoiYXV0aCIsImV4cCI6MTY2NDAwNzEwNn0.5WI3sZ3Z8lTI9hrOHexvor-EJ8_0_MXkygyyRNbEEgE");

          System.out.println(a);
    }
}

