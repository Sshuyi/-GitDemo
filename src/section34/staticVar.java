package section34;

public class staticVar {
	
	String name;
	String address;
	static String city = "Bangalore";  // class variables, share the same value
	static int i =0;
	
	/*
	 * static {
	 * city = "Bangalore";
	 * i = 0;
	 * }  
	 * */
	
	staticVar(String name, String address) {
		
		this.name = name; // give instance variable a value
		this.address = address;
		i++;
		System.out.println(i);
		 
	}
// static method only accepts static variables
	public void getAddess( ) {
		System.out.println(address + " " + city);
	}
	
	public static void main(String[] args) {
		
		staticVar obj = new staticVar("Bob", "Marthalli");
		staticVar obj1 = new staticVar("Ram", "Jayangar");
		obj.getAddess();
		obj1.getAddess();
	}

}
