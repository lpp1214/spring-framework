package mytest;


import mytest.bean.Car;
import mytest.bean.Department;
import mytest.bean.MyTestBean;
import mytest.xsdTest.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Test {
	public static void main(String[] args) throws Exception {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));

		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());

		Department department = (Department) bf.getBean("department");

		/*
		User user = (User) bf.getBean("testBean");
		System.out.println(user.getUserName() + " : " + user.getEmail());

		Car car = (Car) bf.getBean("car");
		System.out.println(car.getBrand() + " : " + car.getMaxSpeed() + " : " + car.getPrice());
		*/

		System.out.println("finish!!!");
	}
}
