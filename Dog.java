public class Dog extends Animal {
	public Dog(String name, int numLegs) {
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public String toString() {
		return this.name + " (" + this.numLegs + " legs)";
	}
}