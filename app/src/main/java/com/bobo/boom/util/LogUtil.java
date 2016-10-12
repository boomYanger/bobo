package com.bobo.boom.util;

import com.bobo.boom.BuildConfig;
import com.orhanobut.logger.Logger;

/**
 * Created by BoBoYang on 2016/10/11.
 */
public class LogUtil {
    public static boolean isDebug = BuildConfig.DEBUG;
    public static final String TAG = "poker.android";

    public static void d(String message, Object... args) {
        if(isDebug)
        Logger.d(message, args);
    }

    public static void d(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).d(message, args);
    }

    public static void d(Object object) {
        if(isDebug)
        Logger.d(object);
    }

    public static void d(String tag, Object object) {
        if(isDebug)
        Logger.t(tag).d(object);
    }

    public static void e(String message, Object... args) {
        if(isDebug)
        Logger.e(null, message, args);
    }

    public static void e(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).e(null, message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        if(isDebug)
        Logger.e(throwable, message, args);
    }

    public static void e(String tag, Throwable throwable, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).e(throwable, message, args);
    }

    public static void i(String message, Object... args) {
        if(isDebug)
        Logger.i(message, args);
    }

    public static void i(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).i(message, args);
    }

    public static void v(String message, Object... args) {
        if(isDebug)
        Logger.v(message, args);
    }

    public static void v(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).v(message, args);
    }

    public static void w(String message, Object... args) {
        if(isDebug)
        Logger.w(message, args);
    }

    public static void w(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).w(message, args);
    }

    public static void wtf(String message, Object... args) {
        if(isDebug)
        Logger.wtf(message, args);
    }

    public static void wtf(String tag, String message, Object... args) {
        if(isDebug)
        Logger.t(tag).wtf(message, args);
    }

    /**
     * Formats the json content and print it
     *
     * @param json the json content
     */
    public static void json(String json) {
        if(isDebug)
        Logger.json(json);
    }

    public static void json(String tag, String json) {
        if(isDebug)
        Logger.t(tag).json(json);
    }

    /**
     * Formats the json content and print it
     *
     * @param xml the xml content
     */
    public static void xml(String xml) {
        if(isDebug)
        Logger.xml(xml);
    }

    public static void xml(String tag, String xml) {
        if(isDebug)
        Logger.t(tag).xml(xml);
    }
}
