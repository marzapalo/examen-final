package pregunta_04;

public abstract class Sandwich {
    protected String description;

    public abstract String getDescription();

    public abstract double calculateCost();
    
    public abstract String make();
}