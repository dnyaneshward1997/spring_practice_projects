package com.cdac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.MyDao;

@Service
public class MyService {

	@Autowired
	private MyDao myDao;

	public MyDao getMyDao() {
		return myDao;
	}

	public void setMyDao(MyDao myDao) {
		this.myDao = myDao;
	}

	public void add() {
		System.out.println("add() method called");
		myDao.save();
	}

}
