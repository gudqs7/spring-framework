package cn.gudqs7.spring.tests;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wq
 */
@Service
public class UserServiceImpl {

	@Resource
	private ServerStarter starter;

	public void sayHi() {
		System.out.println(starter);
		System.out.println("Hello Spring!");
	}

	public void setStarter(ServerStarter starter) {
		this.starter = starter;
	}
}
