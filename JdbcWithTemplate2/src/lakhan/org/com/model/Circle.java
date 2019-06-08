package lakhan.org.com.model;

public class Circle {
	int id ;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Circle() {}
	public Circle(int circleid, String circlename) {
		setId(circleid);
		setName(circlename);
	}
	@Override
	public String toString() {
		return "Circle [id=" + id + ", name=" + name + "]";
	}
	
	

}
