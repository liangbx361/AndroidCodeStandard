package com.liangbx.android.androidcodestandard.exception;

/**
 * <p>Title: <／p>
 * <p>Description: <／p>
 * <p>Copyright: Copyright (c) 2016<／p>
 * <p>Company: 网龙公司<／p>
 *
 * @author liangbx
 * @version 1.0
 * @data 2016/4/19.
 */
public class Sample {

    /**
     * 计算总和
     * @param value1
     *              值1
     * @param value2
     *              值2
     * @return  两个值的总和
     *
     * @throws NumberFormatException
     *              参数为非整形值时报数值转换异常
     */
    public int sum(String value1, String value2) throws NumberFormatException {
        int a = Integer.valueOf(value1);
        int b = Integer.valueOf(value2);
        return a + b ;
    }
}
