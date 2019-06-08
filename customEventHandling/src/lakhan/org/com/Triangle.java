package lakhan.org.com;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class Triangle implements ApplicationEventPublisherAware {
	Point pointA;
	private ApplicationEventPublisher publisher;

	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public void show(){
		System.out.println(" x and y point is as following");
		System.out.println("point x:"+getPointA().getX());
		System.out.println("point y:"+getPointA().getY());
		DrawEvent dra=new DrawEvent(this);
		publisher.publishEvent(dra);
	}


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}
}
