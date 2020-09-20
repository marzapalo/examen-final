package pregunta_02;

public class Client {

	public static void main(String[] args) throws Exception {
		Vehicle vehicle = getVehicle("motorcycle", "sportbike");
		System.out.println(vehicle.doSomething());
	}
	
	public static Vehicle getVehicle(String type, String subType) {
		  Vehicle vehicle = null;
		  if (type.equals("car")) {
		    switch (subType) {
		      case "compact": vehicle = new CompactCar(); break;
		      case "sedan": vehicle = new SedanCar(); break;
		    }
		  } else if(type.equals("motorcycle")) {
		    switch (subType) {
		      case "scooter": vehicle = new Scooter(); break;
		      case "sportbike": vehicle = new SportBike(); break;
		    }
		  }
		  return vehicle;
		}
	
}