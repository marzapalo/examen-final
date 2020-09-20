package pregunta_03;

public class Circle extends Shape {

 public Circle(PaintAPI paintAPI) {
    super(paintAPI);

 }

@Override
public void paint() {
	paintAPI.paint();
}

}