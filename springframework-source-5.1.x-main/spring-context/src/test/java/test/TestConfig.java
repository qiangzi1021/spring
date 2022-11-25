package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: springframework-source-5.1.x-main
 * @description: 1
 * @author: zhengliqiang
 * @create: 2022-11-24 14:47
 **/
@Configuration
public class TestConfig {
	@Bean
	public String name() {
		return "Hello Spring.";
	}
}
