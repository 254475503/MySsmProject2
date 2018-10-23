package com.sohu.yifanshi.controller;

import com.alibaba.fastjson.JSONObject;
import com.sohu.yifanshi.entity.ScCar;
import com.sohu.yifanshi.service.CarService4Manager;
import com.sohu.yifanshi.util.RedisCacheManager;
import com.sohu.yifanshi.web.CarVo;

import org.aspectj.weaver.ast.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private CarService4Manager carService4Manager;
    @Autowired
    private RedisCacheManager redisCacheManager;

    @RequestMapping("/hello")
    public String hello(ModelMap modelMap)
    {
        logger.info("get in hello controller");
        List<CarVo> carVoList = carService4Manager.getAllCar();
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
            redisCacheManager.getRedisTemplate().opsForValue().set("jsonObject1",jsonObject1);
        }catch (Exception e)
        {
            logger.error("cached error");
            return "cached error";
        }

        return "cached successfully";
    }
}
