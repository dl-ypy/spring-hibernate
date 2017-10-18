package com.ypy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ypy.dao.IUserDao;
import com.ypy.pojo.TUser;
import com.ypy.service.IUserService;
@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private IUserDao dao;
	@Override
	public List<TUser> query() {
		return dao.query();
	}

}
