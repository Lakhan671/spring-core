package lakhan.org.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircleText {
	public static void main(String[] as){
		ApplicationContext context=new ClassPathXmlApplicationContext("sp.xml");
		Circle tri=(Circle)context.getBean("circle");
		tri.drawing();
		
	}

}
