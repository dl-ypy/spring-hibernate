package com.ypy.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ypy.dao.IUserDao;
import com.ypy.pojo.TUser;
@Repository
public class UserDaoImpl implements IUserDao {
	@Autowired
	private SessionFactory factory;
	@Override
	public List<TUser> query() {
		Session session = factory.getCurrentSession();
		String hql = "from TUser";
		Query createQuery = session.createQuery(hql);
		return createQuery.list();
	}

}
