package lakhan.org.com;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestShape {
	public static void main(String[] as){
		ApplicationContext context=new ClassPathXmlApplicationContext("sring.xml");
		Triangle tri=(Triangle)context.getBean("tri");
		tri.drawing();
		System.out.println(context.getMessage("g",null,"default message",null));
	}
}