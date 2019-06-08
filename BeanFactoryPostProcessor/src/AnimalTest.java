import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnimalTest {
public static void main(String as[]){
	ApplicationContext contex =new ClassPathXmlApplicationContext("spring.xml");
	Animal animal=(Animal)contex.getBean("tigerCat");
	animal.animalInformation();
	
}
}
