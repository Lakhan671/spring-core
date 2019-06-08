package lakhan.org.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import lakhan.org.com.model.Circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component
public class JdbdDAOImp {
	//@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate=new JdbcTemplate();
	
	public Circle getRecord(int ID){
		String sql="SELECT NAME FROM CIRCLE WHERE ID=?";
		return jdbctemplate.queryForObject(sql,new Object[]{ID} ,new CircleMapper());
	}
	
	public String getRecordID(int ID){
	String sql="SELECT NAME FROM CIRCLE WHERE ID=?";
	return jdbctemplate.queryForObject(sql,new Object[]{ID} ,String.class);
}
	public List<Circle> allrecord(){
		String sql="SELECT * FROM CIRCLE";
		return jdbctemplate.query(sql,new CircleMapper());
		
		
	}
	public int getcountNociecle(){
		String sql="SELECT COUNT(*) FROM CIRCLE";
		//2.jdbctemplate.setDataSource(getDataSource());
		return jdbctemplate.queryForInt(sql);
		}/*
	public void insertRecord(Circle circle){
		String sql="insert into lakhan(id,name,address) values(1001,'lakhan singh',delhi)";
		jdbctemplate.update(sql,new Object[]{circle.getId(),circle.getName()});
		
	}*/
	public void insertRecord(){
		System.out.println("enter the id ");
		int s1=new Scanner(System.in).nextInt();
		System.out.println("enter the name ");
		String s2=new Scanner(System.in).next();
		System.out.println("enter the address ");
		String s3=new Scanner(System.in).next();
		String sql="insert into lakhan(id,name,address) values(s1,s2,s3)";
		//jdbctemplate.update(sql);
		jdbctemplate.update(sql,new Object[]{s1,s2,s3},String.class);
		System.out.println("record is inserted");
		
		
	}
	public void createTable(){
		 String sql="create table lakhan(id integer,name varchar(15),address varchar(16))";
	      jdbctemplate.execute(sql);
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	public DataSource getDataSource() {
		return dataSource;
	}
     @Autowired
	public void setDataSource(DataSource dataSource) {
		//1.this.dataSource = dataSource;
	
	    this.jdbctemplate=new JdbcTemplate(dataSource);
	}
 public static final class CircleMapper implements RowMapper<Circle>{

	@Override
	public Circle mapRow(ResultSet resultset, int rowNum) throws SQLException {
		Circle circle=new Circle();
		circle.setId(resultset.getInt("ID"));
		//System.out.print(resultset.getInt("ID"));
		circle.setName(resultset.getString("NAME"));
		return circle;
	}
	 
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