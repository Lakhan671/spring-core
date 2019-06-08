package lakhan.org.com.model;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("circle'setter is called");
	
	    throw(new RuntimeException());
	}
	public String setNameReturn(String name) {
		this.name = name;
		System.out.println("circles'setter is called");
	    return name;
	   
	}

}
