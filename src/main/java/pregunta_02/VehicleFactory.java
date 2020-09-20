package pregunta_02;

public class VehicleFactory implements IVehicleFactory {

	@Override
	public IVehicle getCompactCar() {
		return new CompactCar();
	}

	@Override
	public IVehicle getSedanCar() {
		return new SedanCar();
	}

	@Override
	public IVehicle getScooterMotorCycle() {
		return new Scooter();
	}

	@Override
	public IVehicle getSportBikeMotorCycle() {
		return new SportBike();
	}
}