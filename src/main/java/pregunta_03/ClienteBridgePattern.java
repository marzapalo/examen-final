package pregunta_03;

public class ClienteBridgePattern {
	   public static void main(String[] args) {
		      Shape blueCircle = new Circle(new BlueCircle());
		      Shape blackCircle = new Circle(new BlackCircle());

		      Shape redSquare = new Square(new RedSquare());
		      Shape greenSquare = new Square(new GreenSquare());

		      blueCircle.paint();
		      blackCircle.paint();

		      redSquare.paint();
		      greenSquare.paint();
		   }
}
