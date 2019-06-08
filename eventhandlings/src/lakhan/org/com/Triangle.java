package lakhan.org.com;

public class Triangle {
	Point pointA;

	
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
	}
}
