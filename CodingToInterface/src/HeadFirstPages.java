

public class HeadFirstPages implements allpages{
	private Lines line;

	@Override
	public void allInformatiom() {
		System.out.println("in side headfirst class");
		System.out.println("line is:"+getLine().getLine1());
	}

	public Lines getLine() {
		return line;
	}

	public void setLine(Lines line) {
		this.line = line;
	}

	

	
}
