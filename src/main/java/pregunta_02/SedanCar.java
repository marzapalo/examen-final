package pregunta_02;

public class SedanCar extends Vehicle {	
	
	@Override
	public String getName() {		
		return "Sedan Car";
	}		
	
	@Override
	public String doSomething() {
		return "Hello! I'm a Sedan Car.";
	}

}