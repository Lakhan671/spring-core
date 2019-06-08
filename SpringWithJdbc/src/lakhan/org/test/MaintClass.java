package lakhan.org.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import lakhan.org.JDBC.jdbc;
import lakhan.org.Student.Student;

public class MaintClass {
	public static void main(String[] arg){
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
	     jdbc d=(jdbc)con.getBean("lakhan");
	     List<Student> stt=d.getInformation();
	     System.out.println(stt);
	   /*  
		try{
		
			jdbc obj=new jdbc();
     
			List<Student> stt=obj.getInformation();
		System.out.println(stt);
		if(obj.getInformation() != null){
			System.out.println("not null");
		}else{
			System.out.println("null");
		}
	
		}catch(Exception f){
			System.out.println(f);
		}
		}*/

}
}
