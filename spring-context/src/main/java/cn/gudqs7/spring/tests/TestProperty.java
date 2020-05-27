package cn.gudqs7.spring.tests;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wq
 */
public class TestProperty {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:application-wq.xml");
		Object userService = applicationContext.getBean("userService");
//		Object userService3 = applicationContext.getBean("serverStarter");
		if (userService instanceof UserServiceImpl) {
			UserServiceImpl userService1 = (UserServiceImpl) userService;
			userService1.sayHi();
		}
	}

}
