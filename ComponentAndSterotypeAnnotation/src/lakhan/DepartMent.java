package lakhan;
public class DepartMent implements boyAndgirl{
	Students student1;
	Students student2;
	Students student3;
	public Students getStudent1() {
		return student1;
	}
	public void setStudent1(Students student1) {
		this.student1 = student1;
	}
	public Students getStudent2() {
		return student2;
	}
	public void setStudent2(Students student2) {
		this.student2 = student2;
	}
	public Students getStudent3() {
		return student3;
	}
	public void setStudent3(Students student3) {
		this.student3 = student3;
	}
	@Override
	public void studentDetail(){
		System.out.println("...First student detail as..");
		System.out.println("Name: "+getStudent1().getName());
		System.out.println("Roll: "+getStudent1().getRoll());
		System.out.println("Address: "+getStudent1().getAddress());
		System.out.println(".....second student detail as....");
		
		System.out.println("Name: "+getStudent2().getName());
		System.out.println("Roll: "+getStudent2().getRoll());
		System.out.println("Address: "+getStudent2().getAddress());
		System.out.println(".....third student detail as....");
		
		System.out.println("Name: "+getStudent3().getName());
		System.out.println("Roll: "+getStudent3().getRoll());
		System.out.println("Address: "+getStudent3().getAddress());
		
	}

}
