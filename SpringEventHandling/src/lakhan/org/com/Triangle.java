package lakhan.org.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware{
	ApplicationEventPublisher Ae;
	points p;
	

	public points getP() {
		return p;
	}

    @Autowired
	public void setP(points p) {
		this.p = p;
	}
      
    public void show(){
    	System.out.println("x:"+getP().getX());
    	System.out.println("y:"+getP().getY());
    	Ae.publishEvent(new ShowEvent(this));
    }
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher Ae)
	{
		this.Ae=Ae;
		//System.out.println(Ae.toString());
		// TODO Auto-generated method stub
		

	}

	
	
}

