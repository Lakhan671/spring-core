package lakhan.org.com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.naming.NameParser;
import javax.sql.DataSource;

import lakhan.org.com.model.Circle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
@Component
public class JdbdDAOImp {
	//@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbctemplate=new JdbcTemplate();
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate; 
	
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
	public void insertRecord(Circle circle){
		
		String sql="insert into circle(id,name) values(:id,:name)";
		SqlParameterSource parameter=new MapSqlParameterSource("id",circle.getId()).addValue("name",circle.getName());
		namedParameterJdbcTemplate.update(sql, parameter);
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
	    this.namedParameterJdbcTemplate=new NamedParameterJdbcTemplate(dataSource);
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
	


}