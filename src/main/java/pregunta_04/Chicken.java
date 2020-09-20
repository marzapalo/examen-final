package pregunta_04;

public class Chicken extends SandwichDecorator {

    public Chicken(Sandwich sandwich) {
        super(sandwich);
        this.description = "Ham" + " [" + 1.00+"]";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", sandwich.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.sandwich.calculateCost() + 1.00;
    }
}