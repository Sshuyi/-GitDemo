package section33;

public abstract class ParentAirCraft { // if their is one class defined as abstract method then the class will be abstract class

	public void engine() {
		System.out.println("Follow Engine Guidelines");
	}
	
	public void safetyGuidelines() {
		System.out.println("Follow Safety Guidelines");
	}
	
	public abstract void bodyColor();
	
	
}
