package Lakhan.org.com;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
	public static void main(String as[]){
		ClassPathXmlApplicationContext contex=new ClassPathXmlApplicationContext("spring.xml");
	  Student st=(Student)contex.getBean("lakhan");
	  st.InfoOfStudent();
	}

}
