package lakhan.org.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import lakhan.org.Student.Student;
@Component
public class jdbc {
	
	public List<Student> getInformation(){
		 List<Student> stu=new ArrayList<Student>();
		
	try{	Class.forName("org.apache.derby.jdbc.ClientDriver");

		Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/lakhan_db");

		PreparedStatement ps= con.prepareStatement("select * from student");
         
        Student st=null;
		ResultSet rs= ps.executeQuery();
		while(rs.next()){
		st=	new Student();
		st.setRollno(rs.getInt(1));	
		st.setCollege(rs.getString(2));
		st.setBranch(rs.getString(3));
		st.setDuration(rs.getInt(4));
		stu.add(st);
		//System.out.println(st);
		//	System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getInt(4));

		
		
			
			}
		
		//return stu;
	
	}catch(Exception s){
		System.out.println(s);
	}
	return stu;

}
}