package lakhan.org.com;


public class Triangle implements Drawing{
	Points pointA;
	Points pointB;
	Points pointC;
	Triangle(){}
	public Triangle(Points pointA, Points pointB, Points pointC) {
		super();
		this.pointA = pointA;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	public Points getPointA() {
		return pointA;
	}
	public void setPointA(Points pointA) {
		this.pointA = pointA;
	}
	public Points getPointB() {
		return pointB;
	}
	public void setPointB(Points pointB) {
		this.pointB = pointB;
	}
	public Points getPointC() {
		return pointC;
	}
	public void setPointC(Points pointC) {
		this.pointC = pointC;
	}
	@Override
	public void drawing() {
		System.out.println("All points as");
		System.out.println("triangleA:"+getPointA().getX()+" "+getPointA().getY());
		System.out.println("triangleB:"+getPointB().getX()+" "+getPointB().getY());
		System.out.println("triangleC:"+getPointC().getX()+" "+getPointC().getY());
		
		
	}
	

}
