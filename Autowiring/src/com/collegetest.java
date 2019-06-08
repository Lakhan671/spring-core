package com;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class collegetest {
	public static void main(String arg[]){
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext contex=new ClassPathXmlApplicationContext("spring.xml");
		college co=(college)contex.getBean("coll");
		co.studentInformation();
		
	}

}
