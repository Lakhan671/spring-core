package lakhan.org.Student;

public class Student {
int rollno;

String college;
String branch;
int duration;
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
@Override
public String toString() {
	return "Student [rollno=" + rollno + ", college=" + college + ", branch="
			+ branch + ", duration=" + duration + "]";
}

}
