package pregunta_04;

public class SandwichDecorator extends Sandwich {

    protected Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String getDescription() {
        return sandwich.description;
    }

    @Override
    public double calculateCost() {
        return sandwich.calculateCost();
    }

	@Override
	public String make() {
		return "Costo total es: " + calculateCost();
	}
}