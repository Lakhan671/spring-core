package lakhan.org.com;

public class college {
	private StudentInformation student1;
	private StudentInformation student2;
	private StudentInformation student3;
	public StudentInformation getStudent1() {
		return student1;
	}
	public void setStudent1(StudentInformation student1) {
		this.student1 = student1;
	}
	public StudentInformation getStudent2() {
		return student2;
	}
	public void setStudent2(StudentInformation student2) {
		this.student2 = student2;
	}
	public StudentInformation getStudent3() {
		return student3;
	}
	public void setStudent3(StudentInformation student3) {
		this.student3 = student3;
	}
	public void studentInformation(){
		System.out.println("my name: "+getStudent1().getName()+" "+"Roll No: "+getStudent1().getRollno());
		System.out.println("my name: "+getStudent2().getName()+" "+"Roll No: "+getStudent2().getRollno());
		System.out.println("my name: "+getStudent3().getName()+" "+"Roll No: "+getStudent3().getRollno());
	}
	
}
