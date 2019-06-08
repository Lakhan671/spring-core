package Lakhan.org.com;

public class Student {
	StudentInformation student1;
    StudentInformation student2;
    StudentInformation student3;
	
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

	public void InfoOfStudent(){
    	System.out.println("...Student 1 information...");
    	System.out.println("Name:"+getStudent1().getName());
    	System.out.println("RollNo:"+getStudent1().getRoll());
    	System.out.println("college:"+getStudent1().getCollegeName()); 
    	System.out.println("...Student 2 information...");
    	System.out.println("Name:"+getStudent2().getName());
    	System.out.println("RollNo:"+getStudent2().getRoll());
    	System.out.println("college:"+getStudent2().getCollegeName()); 
    	System.out.println("...Student 3 information...");
    	System.out.println("Name:"+getStudent3().getName());
    	System.out.println("RollNo:"+getStudent3().getRoll());
    	System.out.println("college:"+getStudent3().getCollegeName()); 
    	
    	
    }
    

}
