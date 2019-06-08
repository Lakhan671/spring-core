package lakhan.org.com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeTest {
	public void main(String as[]){
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
         Triangle tri=(Triangle) context.getBean("lakhan");	
         tri.show();
	
	}

}
