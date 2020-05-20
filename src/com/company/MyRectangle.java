package com.company;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class MyRectangle extends MySquare{
    private int width, height, x, y;
    public MyRectangle(int x, int y, int width, int height){
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    @Override
    public void draw(Group root){
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        root.getChildren().add(rectangle);
    }
}
