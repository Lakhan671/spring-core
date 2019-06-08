
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class LibraryTest {
	public static void main(String as[]){
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		BookCollection book=(BookCollection) context.getBean("lakhan");
		book.bookinformation();
		
	}

}
