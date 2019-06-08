package lakhan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CollegeTest {
	public static void main(String as[]){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		boyAndgirl dep=(boyAndgirl )context.getBean("Itdepartment");
		dep.studentDetail();
	}

	
	

}
