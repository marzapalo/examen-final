package pregunta_03;

public abstract class Shape {
 protected PaintAPI paintAPI;
 
 protected Shape(PaintAPI paintAPI){
    this.paintAPI = paintAPI;
 }
 public abstract void paint();	
}
