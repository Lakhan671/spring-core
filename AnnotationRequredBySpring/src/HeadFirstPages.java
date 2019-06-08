import org.springframework.beans.factory.annotation.Required;



public class HeadFirstPages implements allpages{
	private Lines l;

	@Override
	public void allInformatiom() {
		System.out.println("in side headfirst class");
		System.out.println("line is:"+getL().getLine1());
	}

	public Lines getL() {
		return l;
	}
    @Required
	public void setL(Lines l) {
		this.l = l;
	}


	

	
}
