package com.chenyanwu.erp.erpframework.common;

/**
 * @Auther: chenyanwu
 * @Date: 2019/2/27 18:54
 * @Description:
 * @Version 1.0
 */
public class Constants {
    /**
     * shiro采用加密算法
     */
    public static final String HASH_ALGORITHM = "SHA-1";
    /**
     *系统用户默认密码
     */
    public static final String DEFAULT_PASSWORD = "123456";

    /**
     * 生成盐的长度
     */
    public static final int SALT_SIZE = 8;

    /**
     * 生成Hash值的迭代次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 验证码
     */
    public static final String VALIDATE_CODE = "validateCode";

    /**
     * fork/join 阈值
     */
    public static final int THRESHOLD = 10;
}
