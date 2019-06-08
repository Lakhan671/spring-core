package lakhan.org.com;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;

@Controller
public class Circle implements Drawing{
	public Points centre;
	@Autowired
	private MessageSource messagesource;
	

	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public Points getCentre() {
		return centre;
	}

    @Resource
	public void setCentre(Points centre) {
		this.centre = centre;
	}
    @PostConstruct
    public void initalizeCenter(){
    	System.out.println("init of circle");
    }
    public void destroyed(){
    	System.out.println("");
    }

	@Override
	public void drawing() {
		System.out.println("center as:"+getCentre().getX()+"  "+getCentre().y);
		System.out.println(this.messagesource.getMessage("g",null,"default message",null));
		
	}

}
