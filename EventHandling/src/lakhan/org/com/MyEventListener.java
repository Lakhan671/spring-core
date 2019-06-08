package lakhan.org.com;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component 
public class MyEventListener implements ApplicationListener{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
		// TODO Auto-generated method stub
		
	}

}
