package com.yan.ymall.common.utils;

import java.lang.reflect.Field;

/**
 * 反射工具类
 * @author yandonghai
 * @date 2019/7/26 16:55
 */
public class ReflectUtils {

    public static Object getColumnValue(Object obj,String fieldName) {
        Object result = null;
        if(obj != null) {
            try {
                Field field = obj.getClass().getField(fieldName);
                field.setAccessible(true);
                result = field.get(obj);
            } catch (NoSuchFieldException e) {
                // e.printStackTrace();
            } catch (IllegalAccessException ex) {

            }
        }
        return result;
    }


}
