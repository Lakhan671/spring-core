package lakhan.org.com;

import org.springframework.context.ApplicationEvent;
public class ShowEvent extends ApplicationEvent {// Craete Event with event class

private static final long serialVersionUID = 1L;
public ShowEvent(Object source) {
super(source);
}

public String toString()
{
return("Hurry!!!!!Show Event occurs ");
}
}
