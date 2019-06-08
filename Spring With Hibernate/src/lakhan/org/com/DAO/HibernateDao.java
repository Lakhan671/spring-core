package lakhan.org.com.DAO;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public int getcountNociecle(){
		String hql="select count(*) from circle";
	Query query= getSessionFactory().openSession().createQuery(hql);
	 return  ((Integer) query.uniqueResult()).intValue();
		
		}

}
