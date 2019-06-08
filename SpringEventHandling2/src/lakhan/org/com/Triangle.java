package lakhan.org.com;

public class Triangle {
	Point pintA;

	public Point getPintA() {
		return pintA;
	}

	public void setPintA(Point pintA) {
		this.pintA = pintA;
	}
	public void show(){
		System.out.println(" x and y point is as following");
		System.out.println("point x:"+getPintA().getX());
		System.out.println("point y:"+getPintA().getY());
	}
}
