package cn.gudqs7.spring.tests.annotation;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author wq
 */
@Aspect
@Component
public class TestAop {

	@Pointcut("execution(* cn.gudqs7.spring.tests.*.*(..))")
	public void test() {

	}

	@Before("test()")
	public void before() {
		System.out.println("=== before ===");
	}
}
