package lakhan.org.com;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

import lakhan.org.com.DAO.HibernateDao;
import lakhan.org.com.DAO.JdbdDAOImp;
import lakhan.org.com.DAO.SimpleJdbcDaoImp;
import lakhan.org.com.model.Circle;

public class JDBCdemo {
	public static void main(String[] arg){
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		//SimpleJdbcDaoImp dd=con.getBean("simpleJdbcDaoImp",SimpleJdbcDaoImp.class);
		HibernateDao ddd=con.getBean("hibernateDao",HibernateDao.class);
		ddd.getcountNociecle();
		
	}

}
