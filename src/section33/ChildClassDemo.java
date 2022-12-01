package section33;

public class ChildClassDemo extends ParentClassDemo{

	public void engine() {
		System.out.println("new engine");
	}
	
	public void audioSystem () {
		System.out.println("New audio system");
	}
	
	public void colour() {
	// because the parent class already define what is colours, so when extends from parent class you can use the 
		// variables w/o define
		System.out.println(colours);
	}
	
 
	public static void main(String[] args) {
		
		ChildClassDemo cd = new ChildClassDemo ();
		cd.brakes();
		cd.engine();
		cd.colour();
		cd.audioSystem(); 

	}

}
