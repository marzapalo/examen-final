package pregunta_04;

public class SmallBreadSandwich extends Sandwich {

    public SmallBreadSandwich() {
        this.description = "Small Sandwich";
    }

    @Override
    public String getDescription() {
        return this.description + " [" + 3.00+"]";
    }

    @Override
    public double calculateCost() {
        return 3.00;
    }

	@Override
	public String make() {
		return "Costo total es: " + calculateCost();
	}
}