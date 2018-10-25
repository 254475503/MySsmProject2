package com.sohu.yifanshi.dao;

import com.sohu.yifanshi.entity.ScCar;
import com.sohu.yifanshi.web.CarVo;

import java.util.List;

public interface CarDao4Manger {
    List<CarVo> getAllCar();
    CarVo getCarById(Integer id);
}
