package lakhan.org.com.DAO;

import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;

public class SimpleJdbcDaoImp extends SimpleJdbcDaoSupport{
	public int getcountNociecle(){
		String sql="SELECT COUNT(*) FROM CIRCLE";
		
		return this.getJdbcTemplate().queryForInt(sql);
		}

}
