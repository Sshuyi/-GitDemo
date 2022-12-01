package section33;

public class AustralianTraffic implements CentralTraffic, ContinentTraffic {
//When use implements then you have to use all the method in this interface
	
	public static void main(String[] args) {
		CentralTraffic a = new AustralianTraffic();
		a.redStop();
		a.greenGo();
		a.yellowWait();

		AustralianTraffic b = new AustralianTraffic();
		b.walkonsymbol();
		b.redStop();
	}

	public void walkonsymbol() {
		System.out.println("walk on symbol");
	}
	
	
	@Override
	public void greenGo() {
		// start writing code for this method 
		System.out.println("green go implementation");
		
	}

	@Override
	public void redStop() {
		System.out.println("red stop implementation");
		
	}

	@Override
	public void yellowWait() {
		System.out.println("yellow wait implementation");
		
	}

	@Override
	public void trainSymbole() {
		
		
	}

}
