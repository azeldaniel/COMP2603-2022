import java.awt.Color;

public class ShapeRunner {

  public static void main(String[] args) {
    SimpleShape s1 = new SimpleShape();
    SimpleShape s2 = new Rectangle(50, 100);
    SimpleShape s3 = new Circle(50);
    Circle s4 = new Circle(30);
    Rectangle s5 = new Rectangle(300, 100);

    SimpleShape[] shapes = new SimpleShape[5];
    shapes[0] = s1;
    shapes[1] = s2;
    shapes[2] = s3;
    shapes[3] = s4;
    shapes[4] = s5;

    for (SimpleShape ss : shapes) {
      ss.calculateArea();
      System.out.println(ss);

      if (ss instanceof Rectangle) { // checks dynamic type
        ss.setColor(Color.BLUE);
        if (ss.getArea() >= 30000) {
          Rectangle r = (Rectangle) ss;
          r.roundEdge(35);
        }
      }

      if (ss instanceof Circle && ss.getArea() < 3000) {
        ss.setColor(Color.RED);
      }
    }

    ShapeScreen s = new ShapeScreen(shapes);
  }
}
