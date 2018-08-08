package me.study.andbar.utils;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;

public class EncryptUtils {

    public static void generateKeyPair() {

        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PublicKey aPublic = keyPair.getPublic();
            PrivateKey aPrivate = keyPair.getPrivate();

            try {
                LogUtils.e("aPrivate.getFormat()" + aPrivate.getFormat() + "\n aPrivate.getEncoded() >> " + new String(aPrivate.getEncoded(), "utf-8"));

                LogUtils.e("二进制形式："+binary(aPrivate.getEncoded(),2));
                LogUtils.e("十六进制形式："+binary(aPrivate.getEncoded(),16));
                LogUtils.e("aPublic.getFormat()" + aPublic.getFormat() + "\n aPublic.getEncoded() >> " + new String(aPublic.getEncoded(), "utf-8"));
                LogUtils.e("二进制形式："+binary(aPublic.getEncoded(),2));
                LogUtils.e("十六进制形式："+binary(aPublic.getEncoded(),16));

            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    /**
     * 将byte[]转为各种进制的字符串
     * @param bytes byte[]
     * @param radix 基数可以转换进制的范围，从Character.MIN_RADIX到Character.MAX_RADIX，超出范围后变为10进制
     * @return 转换后的字符串
     */
    public static String binary(byte[] bytes, int radix){
        return new BigInteger(1, bytes).toString(radix);// 这里的1代表正数
    }

}
