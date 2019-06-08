package lakhan.org.com;

import lakhan.org.com.service.ShaeService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AspectMain {
	public static void main(String[] asg){
		ApplicationContext con=new ClassPathXmlApplicationContext("spring.xml");
		ShaeService ss=con.getBean("shapeservice",ShaeService.class);
		ss.getCircle().setNameReturn("lakhans' circle");
		ss.getCircle().setName("lakhans kumar' circle");
		//System.out.println("get name:"+ss.getTriangle().getName());
		//System.out.println("get name:"+ss.getCircle().getName());
	}

}
