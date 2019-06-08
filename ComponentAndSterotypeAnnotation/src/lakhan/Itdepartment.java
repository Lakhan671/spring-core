package lakhan;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
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
	@Resource
	public void setBoy(Students boy) {
		this.boy = boy;
	}
	@PostConstruct
	public void initializeItdepartment(){
		System.out.println("inital...");
		
	}
	@PreDestroy
	public void destroyItdepartment(){
		System.out.println("destroy....");
		
	}

}
