package mytest;

import mytest.aspectTest.AspectBean;
import mytest.aspectTest.AspectInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("aspectTest.xml");

		AspectBean aspectBean = (AspectBean) ac.getBean("aspectBean");
		aspectBean.test();

		AspectInterface aspectBean2 = (AspectInterface) ac.getBean("aspectBean2");
		aspectBean2.test();

		System.out.println("finish!!!");
	}
}
