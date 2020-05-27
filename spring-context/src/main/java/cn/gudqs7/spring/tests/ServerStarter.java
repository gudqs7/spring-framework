package cn.gudqs7.spring.tests;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * @author wq
 */
@Service
public class ServerStarter implements ApplicationListener<ContextRefreshedEvent> {

	@Inject
	private UserServiceImpl userService;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		String applicationName = event.getApplicationContext().getApplicationName();
		System.out.println(applicationName);
		System.out.println(userService);
		System.out.println("========== started by gudqs7 ==============");
		System.out.println("========== started by gudqs7 ==============");
		System.out.println("========== started by gudqs7 ==============");
	}

	public void setUserService(UserServiceImpl userService) {
		this.userService = userService;
	}
}
