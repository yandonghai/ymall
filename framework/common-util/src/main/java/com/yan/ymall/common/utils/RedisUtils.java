package com.yan.ymall.common.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.DefaultTypedTuple;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @auth: yandonghai
 * @date: 2019/7/24 17:14
 */
public class RedisUtils {

    @Autowired
    private static RedisTemplate redisTemplate;

    public static String getStringValue(String key) {
        Object result = redisTemplate.opsForValue().get(key);
        return result == null?"":result.toString();
    }

    public static List<String> multiGetStringValue(List<String> keys) {
        return redisTemplate.opsForValue().multiGet(keys);
    }

    public static void setStringValue(String key,String value) {
        redisTemplate.opsForValue().set(key,value);
    }

    public static void setStringValue(String key, String value, long timeout, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key,value,timeout,timeUnit);
    }

    public static List<Object> getList(String key) {
        long size = redisTemplate.opsForList().size(key);
        return redisTemplate.opsForList().range(key,0,size);
    }

    public static Object getListValueWithIndex(String key,long index) {
        return redisTemplate.opsForList().index(key,index);
    }

    public static void setListValueWithIndex(String key,long index,Object value) {
        redisTemplate.opsForList().set(key,index,value);
    }

    public static void leftPushList(String key,List<Object> list) {
        redisTemplate.opsForList().leftPushAll(key,list);
    }

    public static void leftPushList(String key,Object value) {
        redisTemplate.opsForList().leftPush(key,value);
    }


    public static void rightPushList(String key,Object value) {
        redisTemplate.opsForList().rightPushAll(key,value);
    }

    public static void rightPushList(String key,List<Object> list) {
        redisTemplate.opsForList().rightPushAll(key,list);
    }

    public static Map<String,Object> getMap(String key) {
        return redisTemplate.opsForHash().entries(key);
    }

    public static Object getMapValue(String key,String hashKey) {
        return redisTemplate.opsForHash().get(key,hashKey);
    }

    public static void putMap(String key,String hashKey,Object value) {
        redisTemplate.opsForHash().put(key,hashKey,value);
    }

    public static void putMap(String key,Map<String,Object> value) {
        redisTemplate.opsForHash().putAll(key,value);
    }

    public static void addSet(String key,Object... values) {
        redisTemplate.opsForSet().add(key,values);
    }

    public static Object getSet(String key) {
        return redisTemplate.opsForSet().members(key);
    }

    public static void addZSet(String key,Object value,double score) {
        redisTemplate.opsForZSet().add(key,value,score);
    }

    public static void addZSet(String key,Set<Object> values,String fieldName) {
        if(!StringUtils.isEmpty(key) && !CollectionUtils.isEmpty(values) && !StringUtils.isEmpty(fieldName)) {
            Set<ZSetOperations.TypedTuple<Object>> typedTuples = new HashSet<>();
            values.stream().forEach(value -> {
                Object fieldValue = ReflectUtils.getColumnValue(value,fieldName);
                double score = Double.valueOf(fieldValue == null?"0.0":fieldValue.toString());
                ZSetOperations.TypedTuple<Object> typedTuple = new DefaultTypedTuple<>(value,score);
            });
            redisTemplate.opsForZSet().add(key,typedTuples);
        }
    }
}
