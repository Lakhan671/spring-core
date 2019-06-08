import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Itdepartment implements boyAndgirl{
    Students boy;
	@Override
	public void studentDetail() {
		System.out.println("..inside it department..");
		System.out.println("roll: "+getBoy().getRoll()+" "+"name:"+getBoy().getName()+"Address: "+getBoy().getAddress());
		
		
	}
	public Students getBoy() {
		return boy;
	}
	@Autowired
	@Qualifier("ItStudent")
	public void setBoy(Students boy) {
		this.boy = boy;
	}
	

}
