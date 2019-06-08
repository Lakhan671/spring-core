package kals.org.com;

import kals.org.Myname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class SimpleSpring {

	
	public static void main(String[] args) {
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		
		//Myname myname=(Myname)factory.getBean("myname");
		//myname.myName();
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("spring.xml");
		Myname myname=(Myname)contex.getBean("myname");
		myname.myName();
		
		
		
		
	}

}
