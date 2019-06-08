package lakhan.org.com.service;

import lakhan.org.com.aspect.Loggable;
import lakhan.org.com.model.Circle;
import lakhan.org.com.model.Triangle;

public class ShaeService {
	private Circle circle;
	private Triangle triangle;
	
	@Loggable
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
