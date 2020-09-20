package pregunta_03;

public class Square extends Shape{
	public Square(PaintAPI paintAPI) {
	    super(paintAPI);

	 }

	@Override
	public void paint() {
		paintAPI.paint();
	}
}
