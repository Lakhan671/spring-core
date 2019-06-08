
public class Pages implements allpages {
	Lines line;

	public Lines getLine() {
		return line;
	}

	public void setLine(Lines line) {
		this.line = line;
	}
	public void allInformatiom(){
		System.out.println("in side pages class");
		System.out.println(".....lines as....");
		System.out.println(getLine().getLine1());
		
	}

}
