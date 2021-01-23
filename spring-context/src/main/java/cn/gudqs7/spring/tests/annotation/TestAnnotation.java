package cn.gudqs7.spring.tests.annotation;

import cn.gudqs7.spring.tests.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author wq
 */
@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("cn.gudqs7.spring.tests")
public class TestAnnotation {

	public static void main(String[] args) {
//		ApplicationContext context = new AnnotationConfigApplicationContext(TestAnnotation.class);
//		UserServiceImpl bean = context.getBean(UserServiceImpl.class);
//		bean.sayHi();

		ApplicationContext xmlContext = new ClassPathXmlApplicationContext("application-wq.xml");
		UserServiceImpl userService = xmlContext.getBean(UserServiceImpl.class);
		userService.sayHi();

	}

}
