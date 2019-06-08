import lakhan.org.interfaces.Game;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestGame {

	public static void main(String[] args) {
	
		ApplicationContext contex= new ClassPathXmlApplicationContext("spring.xml");

    	Game game=(Game)contex.getBean("my");
    	game.displaygame();
	}

}
