package mytest;


import mytest.bean.Department;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		//BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		ApplicationContext ac = new ClassPathXmlApplicationContext("beanFactoryTest.xml");


		//MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		//System.out.println(bean.getTestStr());

		Department department = (Department) ac.getBean("department");

		/*
		User user = (User) bf.getBean("testBean");
		System.out.println(user.getUserName() + " : " + user.getEmail());

		Car car = (Car) bf.getBean("car");
		System.out.println(car.getBrand() + " : " + car.getMaxSpeed() + " : " + car.getPrice());
		*/

		System.out.println("finish!!!");
	}
}
