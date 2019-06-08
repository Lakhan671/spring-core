package lakhan.org.com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.apache.derby.client.am.SqlException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lakhan.org.com.model.Circle;
@Component
public class JdbdDAOImp {
	@Autowired
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public Circle getCircle(int circleid){
	try{		Connection conn=null;
	
		/*String driver="org.apache.derby.jdbc.ClientDriver";
		
		Class.forName(driver).newInstance();*/
	
		conn=dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement("SELECT * from circle where id=? ");
	    ps.setInt(1,circleid);
	    Circle circle=null;
	    ResultSet rs=ps.executeQuery();
	    if(rs.next()){
	    	circle=new Circle(circleid, rs.getString("name"));
	    	
	    }
	 
	rs.close();
	ps.close();
	conn.close();
	return circle;
	
	
	}catch(Exception e){
		System.out.println(e);
		 throw new RuntimeException();
	}
	   
		

}
}