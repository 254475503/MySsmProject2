package com.sohu.yifanshi.service;

import com.sohu.yifanshi.web.CarVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CarService4Manager {
     List<CarVo> getAllCar();
}
