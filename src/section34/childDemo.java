package section34;

public class childDemo extends parentDemo{
	
	String name = "QAClickAcademy";

	public void childDemo () {
		super.parentDemo(); // this should always be the first one  
		System.out.println("I am the constructor of child class");
	}
	
	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
// When there is a duplicated, it always refer to the local variable first
		cd.getStringdata();
		cd.getData();
		
	}
	
	public void getStringdata() {
		
		System.out.println(name);
		
// since we have the same name for child and parent class, and we want to call the value from the parent calss
		// need to use keywork: super
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am in child class");
	}

}
