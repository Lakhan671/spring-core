import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Booktest {
	public static void main(String[] as){
		ApplicationContext contex =new ClassPathXmlApplicationContext("spring.xml");
		allpages pages=(allpages)contex.getBean("Book");
		//Book and Books id are work both
        pages.allInformatiom();
	}

}
