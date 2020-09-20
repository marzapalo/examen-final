package pregunta_04;

public class Egg extends SandwichDecorator {

    public Egg(Sandwich sandwich) {
        super(sandwich);
        this.description = "Cheese" + " [" + 1.25+"]";
    }

    @Override
    public String getDescription() {
        return String.format("%s, %s", sandwich.getDescription(), this.description);
    }

    @Override
    public double calculateCost() {
        return this.sandwich.calculateCost() + 1.25;
    }
}