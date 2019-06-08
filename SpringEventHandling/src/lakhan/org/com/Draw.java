package lakhan.org.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Draw {

public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
Triangle t=(Triangle) context.getBean("tri");
t.show();
}
}