package com.cdac.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.CarDao;
import com.cdac.model.Car;


@Service
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarDao carDao;

	@Override
	public void add(Car car) {
		carDao.save(car);
	}

	@Override
	public void modify(Car car) {
		carDao.update(car);
	}

	@Override
	public void removeById(int id) {
		carDao.deleteById(id);
	}

	@Override
	public Car getById(int id) {
		return carDao.selectById(id);
	}

	@Override
	public List<Car> getAll() {
		return carDao.selectAll();
	}

	@Override
	public void upload(int id, String image) {
		carDao.upload(id, image);
	}
}