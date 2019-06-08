package lakhan.org.com;

import java.util.List;

public class college {
	private List<StudentInformation> students;
	
	public List<StudentInformation> getStudents() {
		return students;
	}

	public void setStudents(List<StudentInformation> student1) {
		this.students = student1;
	}

	public void studentInformation(){
		for(StudentInformation student :students){
			System.out.println("my name: "+student.getName()+" "+"Roll No: "+student.getRollno());
			
		}
		
		
	}
	
}
