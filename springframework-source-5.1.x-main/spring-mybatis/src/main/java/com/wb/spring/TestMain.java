package com.wb.spring;

import com.wb.spring.config.SpringMyBatisConfig;
import com.wb.spring.domain.User;
import com.wb.spring.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author wangbin33
 * @date 2020/5/10 21:25
 */
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext acx = new AnnotationConfigApplicationContext(SpringMyBatisConfig.class);
		UserMapper userMapper = acx.getBean(UserMapper.class);
		for (int i = 0 ; i < 100; i++) {
			User user = userMapper.findUserById(i);
			System.out.println(user);
		}
	}
}
