package com.company;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class MyCircle extends Shape{
    private int x, y, radius;
    public MyCircle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw(Group root){
        Circle circle = new Circle(x, y, radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        root.getChildren().add(circle);
    }

}
