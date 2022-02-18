import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;

public class Rectangle extends SimpleShape {

  private int length;
  private int breadth;
  private int edgeRoundness;

  public Rectangle(int l, int b) {
    length = l;
    breadth = b;
    edgeRoundness = 0;
    xLoc += length + 10;
  }

  public String toString() {
    return "Rectangle: " + super.toString();
  }

  public void calculateArea() {
    area = length * breadth;
  }

  public void roundEdge(int curve) {
    edgeRoundness = curve;
  }

  public Shape draw() {
    return new RoundRectangle2D.Double(
      x,
      y,
      length,
      breadth,
      edgeRoundness,
      edgeRoundness
    );
  }
}
