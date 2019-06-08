package lakhan.org.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import lakhan.org.com.model.Circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class JdbdDAOImp {
	
	private DataSource dataSource;
	private JdbcTemplate template=new JdbcTemplate();
	
	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.template =new  JdbcTemplate(dataSource);
	}
	public int getcirclecount(){
		String sql="select count(*) from circle";
		//template.setDataSource(getDataSource());
	return	template.queryForInt(sql);
	}
    public String getCircleName(int circleid){
    	
    	String sql="SELECT NAME FORM CIRCLE WHERE ID=?";
    return	template.queryForObject(sql,new Object[]{circleid},String.class);
    	
    }
    public Circle getcirclebyid(int id){
    	String sql="select * from circle where id=?";
    	 return	template.queryForObject(sql,new Object[]{id},new circlemapper());
         
    	//Circle c=template.queryForObject(sql,new Object[]{id},new circlemapper());
    
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
	private static final class circlemapper implements RowMapper<Circle>{

		@Override
		public Circle mapRow(ResultSet resultset, int rowNum) throws SQLException {
			Circle circle=new Circle();
			circle.setId(resultset.getInt("id"));
			circle.setName(resultset.getNString("name"));
			return circle;
		}
		
	}

	

}