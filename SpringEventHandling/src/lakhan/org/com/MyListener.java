package lakhan.org.com;


	import org.springframework.context.ApplicationEvent;
	import org.springframework.context.ApplicationListener;
	import org.springframework.stereotype.Component;
	@SuppressWarnings("rawtypes")
	@Component
	public class MyListener implements ApplicationListener{  // define Listener

	@Override
	public void onApplicationEvent(ApplicationEvent e) {
	System.out.println(e.toString());
	}

	}


