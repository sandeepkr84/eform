package dxc.com;

import javax.naming.Context;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SpringExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
			
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		Triangle triangle = (Triangle) context.getBean("triangle");
		Circle circle = (Circle) context.getBean("circle");
		
		triangle.draw();
		circle.draw();

	}

}
