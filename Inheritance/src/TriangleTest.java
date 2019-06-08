import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TriangleTest {
	public static void main(String as[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle test=(Triangle)context.getBean("Triangle2");
		test.drawing();
	
	}

}
