package kals.org;

public class Myname {
	String mynamee;
	int pin;
	public Myname(String mynamee){
		this.mynamee=mynamee;
		
	}
	public Myname(int pin){
		this.pin=pin;
		
	}
     public Myname(String mynamee,int pin) {
		this.mynamee=mynamee;
		this.pin=pin;
	}

	public int getPin() {
		return pin;
	}
	
	public String getMynamee() {
		return mynamee;
	}

	public void setMynamee(String mynamee) {
		this.mynamee = mynamee;
	}

	public void myName(){
		System.out.println("My name is "+getMynamee()+" and my pin number is as "+getPin());
	}

}
