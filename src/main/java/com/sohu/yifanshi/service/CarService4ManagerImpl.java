package com.sohu.yifanshi.service;

import com.sohu.yifanshi.dao.CarDao4Manger;
import com.sohu.yifanshi.web.CarVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService4ManagerImpl implements CarService4Manager {
    @Autowired
    private CarDao4Manger carDao4Manger;
    @Override
    public List<CarVo> getAllCar() {
        return carDao4Manger.getAllCar();
    }

    @Override
    public CarVo getCarById(Integer id) {
        return carDao4Manger.getCarById(id);
    }
}
