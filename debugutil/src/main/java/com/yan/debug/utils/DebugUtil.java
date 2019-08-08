package com.yan.debug.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @auth: yandonghai
 * @date: 2019/4/10 16:46
 */
public class DebugUtil {

    public static void printStackInfo() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        Throwable throwable = new Throwable();
        StringBuilder call = new StringBuilder("");
        for (StackTraceElement element : throwable.getStackTrace()) {
            call.append(sf.format(new Date())).append("  ").append(element.getClassName()).append(".").append(element.getMethodName())
                    .append(" line: ").append(element.getLineNumber()).append("\r\n");

        }
        System.out.println(call);
    }
}
