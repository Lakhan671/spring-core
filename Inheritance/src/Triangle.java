
public class Triangle {
	private Points pointA;
	private Points pointB;
	private Points pointC;
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
	public void drawing(){
		System.out.println("point A :"+(pointA.getX()+" "+pointA.getY() ));
		System.out.println("point B :"+(pointB.getX()+" "+pointB.getY() ));
		System.out.println("point C :"+(pointC.getX()+" "+pointC.getY() ));
		
	}

}
