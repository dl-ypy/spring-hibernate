package com.ypy.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ypy.pojo.TUser;
import com.ypy.service.IUserService;
import com.ypy.service.impl.UserServiceImpl;

public class UserTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		//加载spring的配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService user = (IUserService) ac.getBean(IUserService.class);
		List<TUser> query = user.query();
		for (TUser tUser : query) {
			System.out.println(tUser.getUsername());
		}
	}

}
