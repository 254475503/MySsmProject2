package com.sohu.yifanshi.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class JedisUtil {
    private Logger logger = LoggerFactory.getLogger(JedisUtil.class);
    @Autowired
    private JedisPool jedisPool;

    public Jedis getResource()
    {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
        }catch (Exception e)
        {
            logger.error("can't get redis resource");
        }
        return jedis;
    }

    public void disconnect(Jedis jedis)
    {
        jedis.disconnect();
    }

    public void returnResource(Jedis jedis)
    {
        if(null!=jedis)
            try{
                jedisPool.returnResource(jedis);
            }catch (Exception e)
            {
                logger.error("can't return redis resource" );
            }
    }

    public void brokenResource(Jedis jedis){
        if (jedis!=null) {
            try {
                jedisPool.returnBrokenResource(jedis);
            } catch (Exception e) {
                logger.info("can't release jedis Object");
            }
        }
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }
}
