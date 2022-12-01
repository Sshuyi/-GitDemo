package section33;

public class ChildEmirities extends ParentAirCraft {

	public static void main(String[] args) {
		ChildEmirities c = new ChildEmirities();
// you don't have to override the concrete method to the child class and still be able to call it by creating object
		c.engine();
		c.safetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		System.out.println("Red color on the body");
		
	}

}
