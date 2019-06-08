
public class Animal {
	private AniamlType animaltypeA;
	private AniamlType animaltypeB;
	public AniamlType getAnimaltypeA() {
		return animaltypeA;
	}
	public void setAnimaltypeA(AniamlType animaltypeA) {
		this.animaltypeA = animaltypeA;
	}
	public AniamlType getAnimaltypeB() {
		return animaltypeB;
	}
	public void setAnimaltypeB(AniamlType animaltypeB) {
		this.animaltypeB = animaltypeB;
	}
	public void animalInformation(){
		System.out.println("..first animals comes..");
		System.out.println(getAnimaltypeA().getAnimal1());
		System.out.println(getAnimaltypeA().getAnimal2());
		System.out.println("...second aniamls...");
		System.out.println(getAnimaltypeB().getAnimal1());
		System.out.println(getAnimaltypeB().getAnimal2());
	}
	

}
