package by.Minovich.Shapes;
import java.awt.*;
import by.Minovich.IntDraw.Drawable;

public abstract class Shapes implements Drawable {
  public Point startCoordinate = new Point();

  public Shapes(int x, int y) {
    startCoordinate.setLocation(x, y);
  }
  public abstract void setEndCoordinates(int x, int y);
}