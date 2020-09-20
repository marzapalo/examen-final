package pregunta_04;

public class LargeBreadSandwich extends Sandwich {

    public LargeBreadSandwich() {
        this.description = "Large Sandwich";
    }

    @Override
    public String getDescription() {
        return this.description + " [" + 9.00+"]";
    }

    @Override
    public double calculateCost() {
        return 9.00;
    }

	@Override
	public String make() {
		return "Costo total es: " + calculateCost();
	}
}