package lakhan.org.com;


import lakhan.org.com.DAO.SimpleJdbcDaoImp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCdemo {
	public static void main(String[] arg){
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		//SimpleJdbcDaoImp dd=con.getBean("simpleJdbcDaoImp",SimpleJdbcDaoImp.class);
		SimpleJdbcDaoImp dd=con.getBean("simpleJdbcDaoImp",SimpleJdbcDaoImp.class);
		System.out.println(dd.getcountNociecle());
		
	}

}
