package lakhan.org.com;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lakhan.org.com.DAO.JdbdDAOImp;
import lakhan.org.com.model.Circle;

public class JDBCdemo {
	public static void main(String[] arg){
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		JdbdDAOImp dd=(JdbdDAOImp)con.getBean("jdbdDAOImp",JdbdDAOImp.class);
		
		
		/*System.out.println("Enter the id of shape");
		int id=new Scanner(System.in).nextInt();
		Circle circle=dd.getCircle(id);
		System.out.println("Shape of "+circle.getName());
		System.out.println(circle);*/
		//System.out.println("total number of record is="+dd.getcountNociecle());
	//System.out.println(dd.getRecordID(101));
	//System.out.println(dd.getRecord(101).getName());
	

		//dd.insertRecord();
		dd.insertRecord(new Circle(2004,"Black circle"));
		System.out.println("all record is as following..");
		for(Circle c:dd.allrecord()){
		System.out.println(c);
		
		
	}
		//dd.createTable();
	}

}
