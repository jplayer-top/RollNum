package com.oblivion.myapplication;

/**
 * author:Created by Oblivion on 2017/1/12.
 */
public class NumUtil {
    /**
     *
     * @param f 传入的float值，
     * @param m 传入的执行时间
     * @return
     */
    public static String NumberFormat(float f,int m){
        return String.format("%."+m+"f",f);
    }

    public static float NumberFormatFloat(float f,int m){
        String strfloat = NumberFormat(f,m);
        return Float.parseFloat(strfloat);
    }
}
