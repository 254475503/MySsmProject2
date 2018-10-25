package com.sohu.yifanshi.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;
@Component
public class RedisCacheStorageImpl<V> implements RedisCacheStorage<String,V> {
    public static final Logger logger = LoggerFactory.getLogger(RedisCacheStorageImpl.class);

    public static final String KEY_EMPTY = "key is empty";

    public static final String CONN_FAIL = "jedisUtil can't connect to server";

    @Autowired
    private JedisUtil jedisUtil;

    private static final int EXPIRE_TIME = 3600*24;

    @Override
    public boolean set(String key, V value) {
        return set(key, value,EXPIRE_TIME);
    }

    @Override
    public boolean set(String key, V value, int exp) {
        Jedis jedis = null;

        if(key.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return false;
        }
        String jkey = JSONObject.toJSONString(key);
        String jval = JSONObject.toJSONString(value);

        try{
            jedis = jedisUtil.getResource();
            jedis.setex(jkey,exp,jval);
            return true;
        }catch (Exception e)
        {
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
            return false;
        }finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public V get(String key) {
        Jedis jedis = null;
        if(key.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return null;
        }

        try {
            jedis = jedisUtil.getResource();
            String jkey = JSONObject.toJSONString(key);
            String jval = jedis.get(jkey);
            jedisUtil.returnResource(jedis);
            if(jval.isEmpty())
                return null;
            else
                return (V)JSONObject.parseObject(jval,new TypeReference<V>(){});


        }catch (Exception e)
        {
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
            return null;
        }finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);
        }
    }

    @SuppressWarnings("finally")
    @Override
    public boolean remove(String key) {
        Jedis jedis = null;
        if(key.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return false;
        }
        try {
            jedis = jedisUtil.getResource();
            jedis.del(JSONObject.toJSONString(key));
        }catch (Exception e){
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
            return false;
        }finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);
        }

        return true;
    }

    @Override
    public boolean hset(String cacheKey, String key, V value) {
        Jedis jedis = null;
        if(cacheKey.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return false;
        }
        String jcacheKey = JSONObject.toJSONString(cacheKey);
        String jkey = JSONObject.toJSONString(key);
        String jval = JSONObject.toJSONString(value);
        try {
            jedis = jedisUtil.getResource();
            jedis.hset(jcacheKey,jkey,jval);
        }catch (Exception e)
        {
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
            return false;
        }
        finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);

        }
        return true;
    }
    @SuppressWarnings("unchecked")
    @Override
    public V hget(String cacheKey, String key) {
        Jedis jedis = null;
        if(cacheKey.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return null;
        }

        String jcacheKey = JSONObject.toJSONString(cacheKey);
        String jkey = JSONObject.toJSONString(key);
        try {
            jedis = jedisUtil.getResource();
            return JSONObject.parseObject(jedis.hget(jcacheKey,jkey),new TypeReference<V>(){});
        }catch (Exception e)
        {
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
            return null;
        }finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);
        }
    }

    @Override
    public Map<String, V> hget(String cacheKey) {
        Jedis jedis = null;
        Map<String,V> result = null;
        if(cacheKey.isEmpty())
        {
            logger.error(KEY_EMPTY);
            return null;
        }
        String jcacheKey = JSONObject.toJSONString(cacheKey);
        try {
            jedis = jedisUtil.getResource();
            Map<String,String> map = jedis.hgetAll(jcacheKey);
            if(null!=map)
                for(Map.Entry<String,String> entry : map.entrySet())
                {
                    if(result==null)
                        result = new HashMap<String,V>();
                    result.put(JSONObject.parseObject(entry.getKey(),new TypeReference<String>(){}),
                            JSONObject.parseObject(entry.getValue(),new TypeReference<V>(){}));
                }
                jedisUtil.returnResource(jedis);
        }catch (Exception e)
        {
            logger.error(CONN_FAIL);
            if(null!=jedis)
                jedisUtil.brokenResource(jedis);
        }
        finally {
            if(null!=jedis)
                jedisUtil.returnResource(jedis);
            return result;
        }
    }
}
