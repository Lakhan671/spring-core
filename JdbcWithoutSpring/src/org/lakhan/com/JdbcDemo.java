package org.lakhan.com;

import org.lakhan.com.Dao.JdbcImp;
import org.lakhan.com.model.Circle;

public class JdbcDemo {

	
	public static void main(String[] args) {
		Circle circle=new JdbcImp().getCircle(101);
		System.out.println("circle is:"+circle);
	}

}
