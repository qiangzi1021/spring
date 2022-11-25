package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: springframework-source-5.1.x-main
 * @description: 2
 * @author: zhengliqiang
 * @create: 2022-11-24 14:48
 **/
public class TestMain {
	public static void main(String[] args) {
		ApplicationContext acx =
				new AnnotationConfigApplicationContext(TestConfig.class);
		Object name = acx.getBean("name");
		System.out.println(name);
	}
}
