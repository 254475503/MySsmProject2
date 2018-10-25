package com.sohu.yifanshi.controller;

import com.alibaba.fastjson.JSONObject;
import com.sohu.yifanshi.entity.ScCar;
import com.sohu.yifanshi.service.CarService4Manager;
import com.sohu.yifanshi.util.JedisUtil;
import com.sohu.yifanshi.util.RedisCacheManager;
import com.sohu.yifanshi.util.RedisCacheStorage;
import com.sohu.yifanshi.util.RedisCacheStorageImpl;
import com.sohu.yifanshi.web.CarVo;

import org.apache.ibatis.annotations.Param;
import org.aspectj.weaver.ast.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.jws.WebParam;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private CarService4Manager carService4Manager;
    @Autowired
    private RedisCacheManager redisCacheManager;
    @Autowired
    private JedisUtil jedisUtil;
    @Autowired
    private RedisCacheStorageImpl<List<CarVo>> redisCacheStorageImpl;

    public static final String DEFAULT_KEY_HEAD = "UsedCar:sc_car:";

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap)
    {
        logger.info("get in hello controller");
        List<CarVo> carVoList = carService4Manager.getAllCar();
        modelMap.addAttribute("bean",carVoList);
        logger.info("exit hello controller");
        return "hello";
    }

    @RequestMapping("/helloFromRedis")
    public String helloFromRedis(ModelMap modelMap)
    {
        logger.info("get in hello controller");
        List<CarVo> carVoList = redisCacheStorageImpl.get(DEFAULT_KEY_HEAD+"carVoList");
        modelMap.addAttribute("bean",carVoList);
        logger.info("exit hello controller");
        return "hello";
    }

    @RequestMapping("/redisTest")
    @ResponseBody
    public String redisTest()
    {
        ScCar scCar1 = new ScCar();
        scCar1.setTrimm_id(10000);
        scCar1.setModel_id(1000);
        scCar1.setBrand_id(100);
        scCar1.setId(90);
        JSONObject jsonObject1 = (JSONObject) JSONObject.toJSON(scCar1);
        try {
            redisCacheManager.getRedisTemplate().opsForValue().set("jsonObject1",jsonObject1.toJSONString());
        }catch (Exception e)
        {
            logger.error("redisTemplate cached error");
            return "cached error";
        }
        try
        {
            Jedis jedis = jedisUtil.getResource();
            jedis.set("jsonObject2",jsonObject1.toJSONString());
        }catch (Exception e)
        {
            logger.error("jedisPool cached error");
            return "cached error";
        }


        return "cached successfully";
    }
    @RequestMapping("/cacheIntoRedis")
    @ResponseBody
    public String cacheIntoRedis(@Param(value = "id")Integer id)
    {
        List<CarVo> carVoList = carService4Manager.getAllCar();
        String key = DEFAULT_KEY_HEAD + "carVoList";
        try
        {
            redisCacheStorageImpl.set(key,carVoList);
            logger.info("cache in redis success");
            return JSONObject.toJSONString(redisCacheStorageImpl.get(key));
        }catch (Exception e)
        {
            logger.error("cache in redis failed");
            return "error";
        }
    }

}
