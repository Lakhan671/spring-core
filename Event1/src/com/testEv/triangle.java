package com.testEv;

public class triangle {
	point pointA;

	public point getPointA() {
		return pointA;
	}

	public void setPointA(point pointA) {
		this.pointA = pointA;
	}
	public void show(){
		System.out.println("x:"+getPointA().getX()+"  y:"+getPointA().getY());
	}

}
