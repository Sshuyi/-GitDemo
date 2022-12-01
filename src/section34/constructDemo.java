package section34;

public class constructDemo {
	
// Default 
	public constructDemo() {
		System.out.println("I am the constructor");
	}
	
	public constructDemo(int a, int b) {
		System.out.println("I am the parameterized constructor");
	}

	public void getdata() {
		System.out.println("I am the methd");
	}
	
	public static void main(String[] args) {
		
		// block of code when ever an object is created
		// Constructor will not return any value, same name as class name
		
// if you have a default constructor and another one with parameters, when you call constructor with out any parameters then 
		// the sys will pick the default one.
		constructDemo cd = new constructDemo();
		//compiler will call implicit constructor if you have not defined constructor
		
		constructDemo c = new constructDemo(4,5); 		
	}

}
